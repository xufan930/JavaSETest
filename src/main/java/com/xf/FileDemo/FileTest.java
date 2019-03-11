package com.xf.FileDemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * @Auther: XU
 * @Date: 2018/11/15 11:48
 * @Description:
 */
public class FileTest {
    public static void main(String[] args) {
       /* File file = new File("d:\\abcd");
        MyFileFilter myFileFilter = new MyFileFilter();
        File[] files = file.listFiles(myFileFilter);
        for (File tmp:files) {
            System.out.println(tmp);
        }*/
     /*  File file = new File("D:\\eclipse");
       getall(file);*/
        File file = new File("../hello.txt");
        BufferedWriter bWriter = null;
        try {
            bWriter = new BufferedWriter(new FileWriter(file,true));
        bWriter.write("h");
            System.out.println(file.getCanonicalPath());//获取标准的路径
            System.out.println(file.getAbsolutePath());//获取绝对路径
            System.out.println("--------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void getall(File file){
        File[] files = file.listFiles();
        for (File f : files){
            if (f.isDirectory()){
                getall(f);
            }else {
                System.out.println(f);
            }
        }

    }
}
