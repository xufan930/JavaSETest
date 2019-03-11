package com.xf.SSH;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Auther: XU
 * @Date: 2018/11/8 11:37
 * @Description:
 */
public class Test2 {


    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        InputStream inputStream = Test2.class.getResourceAsStream("/linux.properties");

        prop.load(inputStream);
    }
}
