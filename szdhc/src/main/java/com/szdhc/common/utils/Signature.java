package com.szdhc.common.utils;

import com.szdhc.pojo.WxInfo;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.codec.digest.Md5Crypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * 签名
 *
 * @author zouke
 */
public class Signature {
    private static final Logger LOGGER = LoggerFactory.getLogger(Signature.class);

    /**
     * 签名算法
     *
     * @param o 要参与签名的数据对象
     * @return 签名
     * @throws IllegalAccessException
     */
    public static String getSign(Object o) throws IllegalAccessException {
        ArrayList<String> list = new ArrayList<String>();
        Class cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.get(o) != null && f.get(o) != "") {
                String name = f.getName();
                XStreamAlias anno = f.getAnnotation(XStreamAlias.class);
                if (anno != null)
                    name = anno.value();
                list.add(name + "=" + f.get(o) + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + WxInfo.mch_appid;
        System.out.println("签名数据：" + result);
        LOGGER.info("签名数据：", result);
        result = Md5Crypt.md5Crypt(result.getBytes()).toUpperCase();
        return result;
    }

    public static String getSign(Map<String, Object> map) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != "") {
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + WxInfo.mch_appid;
        //Util.log("Sign Before MD5:" + result);
        LOGGER.info("Sign Before MD5:", result);
        result = Md5Crypt.md5Crypt(result.getBytes()).toUpperCase();
        //Util.log("Sign Result:" + result);
        LOGGER.info("Sign Result:", result);
        return result;
    }
}
