package com.szdhc.dao;

import com.szdhc.pojo.WxUser;
import com.szdhc.pojo.WxUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserDao {
    long countByExample(WxUserExample example);

    int deleteByExample(WxUserExample example);

    int insert(WxUser record);

    int insertSelective(WxUser record);

    List<WxUser> selectByExample(WxUserExample example);

    int updateByExampleSelective(@Param("record") WxUser record, @Param("example") WxUserExample example);

    int updateByExample(@Param("record") WxUser record, @Param("example") WxUserExample example);
}