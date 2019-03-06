package com.szdhc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.szdhc.common.service.HttpClientService;
import com.szdhc.common.utils.GetUserInfo;
import com.szdhc.pojo.WxAPIInfo;
import com.szdhc.pojo.WxInfo;
import com.szdhc.pojo.WxUser;
import com.szdhc.service.WxUserServie;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author zouke
 */
@RestController
@RequestMapping("/weixinuser")
public class WxUserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WxUserController.class);

    @Autowired
    private HttpClientService httpClientService;

    @Autowired
    private WxUserServie wxUserServie;

    @Autowired
    private JedisCluster jedisCluster;

    @RequestMapping(value = "wxLogin",method = RequestMethod.GET)
    public Map<String, Object> wxLogin(Model model,
                                       @RequestParam(value = "code", required = false) String code,
                                       @RequestParam(value = "rawData", required = false) String rawData,
                                       @RequestParam(value = "signature", required = false) String signature,
                                       @RequestParam(value = "encrypteData", required = false) String encrypteData,
                                       @RequestParam(value = "iv", required = false) String iv) {
        Map<String, Object> map = null;
        LOGGER.info("Start get SessionKey");
        map = new HashMap<String, Object>();
        System.out.println("用户非敏感信息" + rawData);
        JSONObject rawDataJson = JSON.parseObject(rawData);
        System.out.println("签名" + signature);
        JSONObject SessionKeyOpenId = getSessionKeyOrOpenId(code);
        System.out.println("post请求获取的SessionAndopenId=" + SessionKeyOpenId);
        String openid = SessionKeyOpenId.getString("openid");
        String sessionKey = SessionKeyOpenId.getString("session_key");
        System.out.println("openid=" + openid + ",session_key=" + sessionKey);

        WxUser wxUser = wxUserServie.findByOpenid(openid);

        //uuid生成唯一key
        String skey = UUID.randomUUID().toString();

        if (wxUser == null) {
            //登入db
            wxUser = getWxUser(rawDataJson, openid, sessionKey, skey);
        } else {
            LOGGER.info("用户openid已存在,不需要插入");
        }

        //根据openid查询skey是否存在
        String skey_redis = jedisCluster.get(openid);
        if (!StringUtils.isEmpty(skey_redis)) {
            //存在 删除 skey 重新生成skey 将skey返回
            jedisCluster.del(skey_redis);

        }
        //  缓存一份新的
        JSONObject sessionObj = new JSONObject();
        sessionObj.put("openId", openid);
        sessionObj.put("sessionKey", sessionKey);
        jedisCluster.setex(skey, 7200, sessionObj.toJSONString());
        jedisCluster.set(openid, skey);

        //把新的sessionKey和oppenid返回给小程序
        map.put("skey", skey);
        map.put("result", "0");

        JSONObject userInfo = GetUserInfo.getUserInfo(encrypteData, sessionKey, iv);
        System.out.println("根据解密算法获取的userInfo=" + userInfo);
        userInfo.put("balance", wxUser.getUbalance());
        map.put("userInfo", userInfo);
        return map;
    }

    @RequestMapping(value = "checkLogin",method = RequestMethod.GET)
    public boolean checkLogin(String skey){
        String str_skey = jedisCluster.get(skey);
        return !StringUtils.isEmpty(str_skey);
    }

    private WxUser getWxUser(JSONObject rawDataJson, String openid, String sessionKey, String skey) {
        WxUser wxUser;
        String nickName = rawDataJson.getString("nickName");
        String avatarUrl = rawDataJson.getString("avatarUrl");
        String gender = rawDataJson.getString("gender");
        String city = rawDataJson.getString("city");
        String country = rawDataJson.getString("country");
        String province = rawDataJson.getString("province");
        Date dateTime = new DateTime().toDate();
        wxUser = new WxUser();
        wxUser.setUid(openid);
        wxUser.setCreatetime(dateTime);
        wxUser.setSessionkey(sessionKey);
        wxUser.setUbalance(0);
        wxUser.setSkey(skey);
        wxUser.setUaddress(country + " " + province + " " + city);
        wxUser.setUavatar(avatarUrl);
        wxUser.setUgender(Integer.parseInt(gender));
        wxUser.setUname(nickName);
        wxUser.setUpdatetime(dateTime);

        wxUserServie.insertWxUser(wxUser);
        return wxUser;
    }

    /**
     * get SessionKeyOrOpenId
     *
     * @param code 小程序端返回的code
     * @return
     */
    private JSONObject getSessionKeyOrOpenId(String code) {
        //微信端登录code
        String wxCode = code;
        String requestUrl = WxAPIInfo.loginUrl;
        Map<String, String> requestUrlParam = new HashMap<String, String>();
        requestUrlParam.put("appid", WxInfo.appid);//小程序appId
        requestUrlParam.put("secret", WxInfo.SECRET);
        requestUrlParam.put("js_code", wxCode);//小程序端返回的code
        requestUrlParam.put("grant_type", "authorization_code");//默认参数

        //发送Get请求读取调用微信接口获取openid用户唯一标识
        JSONObject jsonObject = null;
        try {
            jsonObject = JSON.parseObject(httpClientService.doGet(requestUrl, requestUrlParam));
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage(), e);
        } catch (URISyntaxException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage(), e);
        }
        return jsonObject;
    }

}
