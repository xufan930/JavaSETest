package com.xf.company;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * @Auther: XU
 * @Date: 2018/10/16 10:40
 * @Description:
 */
public class Md5 {
    public static void main(String[] args) {
        byte[] secretByets = null;
        String str = "xufan";

        System.out.println(Arrays.toString(str.getBytes()));
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            System.out.println(str.getBytes());
            md.update(str.getBytes());
            secretByets = md.digest();
            System.out.println(Arrays.toString(secretByets)+"__________________");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String md5code = new BigInteger(1,secretByets).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }

        System.out.println(md5code);
    }
}
