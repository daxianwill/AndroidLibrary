package com.app.myapplication;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Util {

    public static void main(String[] args){
       // String msg = hmacSHA1Encrypt("m%3Dget_resource%26timestamp%3D1484878987%26uid%3D13324","rjy_zyk_online");
        System.out.println("11");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String hmacSHA1Encrypt(String encryptText, String encryptKey) {
        byte[] result = null;
        try {
            //根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
            SecretKeySpec signinKey = new SecretKeySpec(encryptKey.getBytes("UTF-8"), "HmacSHA1");
            //生成一个指定 Mac 算法 的 Mac 对象
            Mac mac = Mac.getInstance("HmacSHA1");
            //用给定密钥初始化 Mac 对象
            mac.init(signinKey);
            //完成 Mac 操作
            byte[] rawHmac = mac.doFinal(encryptText.getBytes("UTF-8"));

            result = Base64.getEncoder().encode(rawHmac);

        } catch (Exception e) {

        }
        if (null != result) {
            return new String(result);
        } else {
            return null;
        }
    }
}
