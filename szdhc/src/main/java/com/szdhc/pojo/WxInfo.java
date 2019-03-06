package com.szdhc.pojo;

/**
 * @author zouke
 */
public interface WxInfo {
    /**
     * 小程序appid
     */
//    String appid = "";
    String appid = "";
    /**
     * 商户号的Appid
     */
    String mch_appid = "";
    /**
     *商户号
     */
    String mch_id = "";
    /**
     *回调地址
     */
    String notify_url = "";
    /**
     *交易类型
     */
    String trade_type = "JSAPI";
    /**
     * 签名类型
     */
    String sign_type = "MD5";
    /**
     * 商户密匙
     */
    String key = "";
    /**
     * 小程序ApiSecret
     */
//    String SECRET = "";
    String SECRET = "";
    /**
     * 证书地址
     */
    String CERTIFICATE_ADDRESS = "";
    /**
     * 二维码图片地址
     */
    String QRImgRootAddress ="";

    /**
     * 静态资源
     */
    String SourceUrl = "";

}
