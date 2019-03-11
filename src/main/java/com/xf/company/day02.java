package com.xf.company;

import java.util.Scanner;

/**
 * @Auther: XU
 * @Date: 2018/9/30 16:22
 * @Description:
 */
public class day02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        char chs[] = String.valueOf(new Scanner(System.in).nextInt()).toCharArray();
        System.out.println("个位是:"+chs[2]+"\n十位是:"+chs[1]+"\n百位是:"+chs[0]);


    }
}
