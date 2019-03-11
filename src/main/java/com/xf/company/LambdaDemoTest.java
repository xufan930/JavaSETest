package com.xf.company;

import java.util.Comparator;

/**
 * @Auther: XU
 * @Date: 2018/11/7 21:42
 * @Description:
 */
public class LambdaDemoTest {


    public void test8(){
        System.out.println("nihao ");
    }

    public void test2(){
        Runnable runnable = () -> System.out.println("hello world");
        Thread thread = new Thread(runnable);
        thread.run();
    }

    public void test3(){
        Comparator<Integer> com = (x, y) -> {
            System.out.println("___________");
            return Integer.compare(x, y);
        };
       int a = com.compare(2, 3);
        System.out.println(a);
    }

    public void test4(){
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        int a = com.compare(2, 3);
        System.out.println(a);
    }
}
