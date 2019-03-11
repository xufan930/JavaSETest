package cn.itcast;

import java.util.UUID;
import java.util.regex.Pattern;

/**
 * @author : XU
 * @date : 2019/1/24 16:37
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6,20}", "123456"));
        String  uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
