package cn.itcast.jiami;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author : XU
 * @date : 2019/3/8 14:39
 */
public class md5hex {
    public static void main(String[] args) {
        String a = "123456";
        String target = DigestUtils.md5Hex("medicalshare_" + a);
        System.out.println(target);
    }
}
