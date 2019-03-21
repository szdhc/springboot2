package com.szdhc.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private String goodid;

    private String goodtypeid;

    private String goodname;

    private BigDecimal goodprice;

    private String gooddescription;

    private String goodimage;

    private Integer goodcount;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    public String getGoodid() {
        return goodid;
    }

    public void setGoodid(String goodid) {
        this.goodid = goodid == null ? null : goodid.trim();
    }

    public String getGoodtypeid() {
        return goodtypeid;
    }

    public void setGoodtypeid(String goodtypeid) {
        this.goodtypeid = goodtypeid == null ? null : goodtypeid.trim();
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public BigDecimal getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(BigDecimal goodprice) {
        this.goodprice = goodprice;
    }

    public String getGooddescription() {
        return gooddescription;
    }

    public void setGooddescription(String gooddescription) {
        this.gooddescription = gooddescription == null ? null : gooddescription.trim();
    }

    public String getGoodimage() {
        return goodimage;
    }

    public void setGoodimage(String goodimage) {
        this.goodimage = goodimage == null ? null : goodimage.trim();
    }

    public Integer getGoodcount() {
        return goodcount;
    }

    public void setGoodcount(Integer goodcount) {
        this.goodcount = goodcount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }
}