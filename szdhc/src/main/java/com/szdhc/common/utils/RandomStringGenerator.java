package com.szdhc.common.utils;

import java.util.Random;

/**
 * 随机字符串生成
 * @author zouke
 */
public class RandomStringGenerator {

    /**
     * 获取一定长度的随机字符串
     * @param length 指定字符串长度
     * @return 一定长度的字符串
     */
     public static String getRandomStringByLength(int length){
         //产生随机数
         Random random = new Random();
         StringBuffer stringBuffer = new StringBuffer();
         for(int i = 0;i<length;i++){
             //产生0-2个随机数，既与a-z，A-Z，0-9三种可能
             int number = random.nextInt(3);
             long result = 0;
             switch (number){
                 case 0:
                     //产生A-Z的ASCII码
                     result = Math.round(Math.random()*25+65);
                     //将ASCII码转换成字符
                     stringBuffer.append(String.valueOf((char)result));
                     break;
                 case 1:
                     //产生a-z的ASCII码
                     result = Math.round(Math.random()*25+97);
                     //将ASCII码转换成字符
                     stringBuffer.append(String.valueOf((char)result));
                     break;
                 case 2:
                     //产生0-9的数字
                     stringBuffer.append(String.valueOf(new Random().nextInt(10)));
                     break;
             }
         }
        return stringBuffer.toString();
    }
}
