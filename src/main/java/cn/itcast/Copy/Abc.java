package cn.itcast.Copy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : XU
 * @date : 2019/1/14 09:55
 */
public class Abc {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        for (Dog dog : list) {
            System.out.println(dog.getName());
        }
        System.out.println(list.isEmpty());

    }
}
