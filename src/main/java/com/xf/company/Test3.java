package com.xf.company;

import java.util.Scanner;

/**
 * @author : XU
 * @date : 2019/2/15 17:05
 */
public class Test3 {
    public static void foo(int a, int b, int c) {
        boolean val = a == c && b != c;
        System.out.println(val);
    }

    public static void main(String[] args) {
        foo(1,2,3);
        Scanner scanner = new Scanner(System.in);
    }
}
