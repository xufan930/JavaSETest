package cn.itcast.day25.demo;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @author : XU
 * @date : 2018/11/22 15:55
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("a", "xufan");
        properties.setProperty("b", "jack");
        System.out.println(properties.getProperty("a"));
        Set<String> set = properties.stringPropertyNames();
        for (String tmp: set ) {
            System.out.println(tmp);
        }
    }


    public  void fun1() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("E:\\db-config.properties");
        Properties pro = new Properties();
        properties.load(inputStream);
        //此时inputStream里已经没有数据了
        pro.load(inputStream);
        System.out.println(properties);
        System.out.println(pro);
        pro.setProperty("qwe", "cccc");
        pro.setProperty("112", "ddd");
        pro.setProperty("fdg", "sdw@163.com");
        FileWriter fileWriter = new FileWriter("E:\\db-config.properties");
        pro.store(fileWriter, "nmsl");
        FileReader fileReader = new FileReader("E:\\db-config.properties");
        Properties a = new Properties();
        a.load(fileReader);
        System.out.println(a);
        //System.out.println(properties);

    }

}
