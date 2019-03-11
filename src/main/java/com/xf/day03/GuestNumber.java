package com.xf.day03;

import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: XU
 * @Date: 2018/10/8 10:44
 * @Description:
 */
public class GuestNumber {
    public static void main(String[] args){
        System.out.println("猜数字开始了");
        System.out.println("输入1-100之间数据");
        //创建Random类变量
        Random ran = new Random();
        //变量.使用功能nextInt()获取1-100随机数
        int ranNumber = ran.nextInt(100)+1;
        //System.out.println(ranNumber);
        //创建Scanner类变量
        Scanner sc = new Scanner(System.in);

        while(true){
            //获取键盘输入
            int number = sc.nextInt();
            //随机数和,用户输入的数据,比较
            if( number > ranNumber){
                System.out.println("猜大了");
            }else if (number < ranNumber){
                System.out.println("猜小了");
            }else{
                System.out.println("中了");
                break;
            }
        }
    }
}
