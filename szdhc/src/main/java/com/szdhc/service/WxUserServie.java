package com.szdhc.service;

import com.szdhc.dao.WxUserDao;
import com.szdhc.pojo.WxUser;
import com.szdhc.pojo.WxUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zouke
 */
@Service
public class WxUserServie {

    @Autowired
    private WxUserDao wxUserMapper;

    /**
     * get WxUser by openId from DB
     * @param openId openId
     * @return
     */
    public WxUser findByOpenid(String openId){
        WxUserExample wxUserExample = new WxUserExample();
        WxUserExample.Criteria criteria = wxUserExample.createCriteria();
        criteria.andUidEqualTo(openId);
        List<WxUser> wxUsers = wxUserMapper.selectByExample(wxUserExample);
        for (WxUser wxUser:wxUsers) {
            return wxUser;
        }
        return null;
    }

    /**
     * insert wxUser into db
     * @param record
     * @return
     */
    public Integer insertWxUser(WxUser record){
        return wxUserMapper.insert(record);
    }
}
