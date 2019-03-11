package com.xf.company;

import java.io.File;

/**
 * @Auther: XU
 * @Date: 2018/10/9 09:57
 * @Description:
 */
public class Dele {
    /**
     * 要利用File类的delete()方法删除目录时，必须保证该目录下没有文件或者子目录，
     * 否则删除失败，因此在实际应用中，我们要删除目录，必须利用递归删除该目录下的所有子目录和文件，然后再删除该目录。
     * @param path
     */
    public static void delDir(String path){
        File dir=new File(path);
        if(dir.exists()){
            File[] tmp=dir.listFiles();
            for(int i=0;i<tmp.length;i++){
                if(tmp[i].isDirectory()){
                    System.out.println(tmp[i].getName());
                    delDir(path+"/"+tmp[i].getName());
                }
                else{
                    tmp[i].delete();
                }
            }
            dir.delete();
        }
    }

    public static void main(String[] args) {
        delDir("D:\\a\\123");
    }

}
