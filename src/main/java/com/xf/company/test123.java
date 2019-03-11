package com.xf.company;

import java.io.File;
import java.io.IOException;


/**
 * @Auther: XU
 * @Date: 2018/11/14 15:07
 * @Description:
 */
public class test123 {
    private String name ;
    public static void main(String[] args) throws IOException {
        File file = new File("c:");
        String[] strArr = file.list();
        System.out.println(strArr.length);
        for(String str : strArr){
            System.out.println(str);
        }
    }


    public void t1(){
        File file = new File("d:\\abcd");
        boolean b = file.delete();
        System.out.println(b);
    }

}
