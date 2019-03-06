package com.szdhc.controller;

import com.szdhc.common.service.HttpClientService;
import com.szdhc.common.utils.RandomStringGenerator;
import com.szdhc.common.utils.Signature;
import com.szdhc.common.utils.StreamUtils;
import com.szdhc.pojo.*;
import com.thoughtworks.xstream.XStream;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zouke
 */
@RestController
@RequestMapping("/weixinpay")
public class WxPayController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WxPayController.class);

    @Autowired
    private HttpClientService httpClientService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    /**
     * 获取openid
     *
     * @param code
     * @return
     */
    @RequestMapping(value = "getOpenId", method = RequestMethod.POST)
    public String getOpenId(String code) {
        //获取到用户的openid的url
        String url = WxAPIInfo.loginUrl;
        //参数
        Map<String, String> param = new HashMap<>();
        param.put("appid", WxInfo.appid);
        param.put("secret", WxInfo.SECRET);
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");
        try {
            String res = httpClientService.doGet(url, param);
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 统一下单
     *
     * @param openid
     * @return
     */
    @RequestMapping(value = "xiadan", method = RequestMethod.POST)
    public String xiadan(String openid) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setAppid(WxInfo.appid);
        orderInfo.setMch_id(WxInfo.mch_id);
        orderInfo.setNonce_str(RandomStringGenerator.getRandomStringByLength(32));
        orderInfo.setBody("CGV影城");
        orderInfo.setOut_trade_no(RandomStringGenerator.getRandomStringByLength(32));
        orderInfo.setTotal_fee(10);
        orderInfo.setSpbill_create_ip("123.57.218.54");
        orderInfo.setNotify_url("https://www.szdhc.com/weixinpay/PayResult");
        orderInfo.setTrade_type("JSAPI");
        orderInfo.setOpenid(openid);
        orderInfo.setSign_type("MD5");
        //生成签名
        String sign = null;
        try {
            sign = Signature.getSign(orderInfo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        orderInfo.setSign(sign);
        try {
            String result = httpClientService.doPost(WxAPIInfo.Create_Order_Prefix_Url, orderInfo);
            LOGGER.info("下单返回结果：---------------", result);
            XStream xStream = new XStream();
            xStream.alias("xml", OrderReturnInfo.class);
            OrderReturnInfo orderReturnInfo = (OrderReturnInfo) xStream.fromXML(result);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("prepay_id", jsonObject.toString());
            return jsonObject.toJSONString();
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error("下单ｅｒｒ----------------", e);
        }
        return null;
    }

    @RequestMapping(value = "sign", method = RequestMethod.POST)
    public String sign(String repay_id) {
        SignInfo signInfo = new SignInfo();
        signInfo.setAppId(WxInfo.appid);
        long time = System.currentTimeMillis() / 1000;
        signInfo.setTimeStamp(String.valueOf(time));
        signInfo.setNonceStr(RandomStringGenerator.getRandomStringByLength(32));
        signInfo.setRepay_id("prepay_id=" + repay_id);
        signInfo.setSignType("MD5");
        //生成签名
        try {
            String sign = Signature.getSign(signInfo);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("timeStamp", signInfo.getTimeStamp());
            jsonObject.put("nonceStr", signInfo.getNonceStr());
            jsonObject.put("package", signInfo.getRepay_id());
            jsonObject.put("signType", signInfo.getSignType());
            jsonObject.put("paySign", sign);
            LOGGER.info("-------再签名:" + jsonObject.toJSONString());
            return jsonObject.toJSONString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            LOGGER.error("sign err:", e);
        }
        return null;
    }

    @RequestMapping(value = "payResult", method = RequestMethod.POST)
    public String payResult() {
        String reqParams = null;
        try {
            reqParams = StreamUtils.read(httpServletRequest.getInputStream());
            LOGGER.info("-------支付结果:", reqParams);
            StringBuffer stringBuffer = new StringBuffer("<xml><return_code>SUCCESS</return_code><return_msg>OK</return_msg></xml>");
            return stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error("支付结果err:", e);
        }
        return null;
    }
}
