package com.zhiyou.fmmall.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {
    public static String md5(String password) {
        byte[] secretByte = null;
        try {
            secretByte = MessageDigest.getInstance("md5").digest(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("md5加密失败");
        }

        String md5Password = new BigInteger(1, secretByte).toString(16);

        for (int i = 0; i < 32 - md5Password.length(); i++) {
            md5Password = "0" + md5Password;
        }
        return md5Password;
    }
}
