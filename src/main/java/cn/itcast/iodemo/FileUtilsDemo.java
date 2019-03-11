package cn.itcast.iodemo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author : XU
 * @date : 2018/12/12 15:35
 */
public class FileUtilsDemo {
   @Test
    public void fun1(){
        System.out.println(123);
       boolean b = FilenameUtils.isExtension("E:\\javawork\\JavaSETest\\src\\main\\java\\cn\\itcast\\TXT\\xuliehua.txt", "txt");
       System.out.println(b);
    }

    @Test
    public void fun2(){
       String b = FilenameUtils.getName("c:\\sdgdfgd");
        System.out.println(b);
    }

    @Test
    public void fun3() throws IOException {
        FileUtils.copyDirectoryToDirectory(new File("E:\\IOtest\\a\\abc"), new File("E:\\IOtest"));
    }
@Test
    public void fun4() throws IOException {
     FileUtils.copyFile(new File("E:\\IOtest\\a\\abc.txt"), new File("E:\\IOtest\\b\\cba.txt"));
    }

    @Test
    public void fun5() throws IOException {
        FileUtils.writeStringToFile(new File("E:\\IOtest\\a\\abc.txt"),"我爱JAVA123" ,"UTF-8" ,true);
        String str = FileUtils.readFileToString(new File("E:\\IOtest\\a\\abc.txt"), "UTF-8");
        System.out.println(str);
    }




}
