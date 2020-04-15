package com.xf.day03;

/**
 * @Auther: XU
 * @Date: 2018/10/8 10:32
 * @Description:
 */
public class Breakdemo1 {
    public static void main(String[] args) {
       a : for (int i = 1;i<10;i++) {
            System.out.println("外层"+i+"开始");
            for (int j = 1; j < 10; j++) {
                System.out.println("123内层"+j+"开始");
                if (j==3 )   {
                    break a;
                }
            }
           System.out.println("外层"+i+"结束");
        }
    }
}
