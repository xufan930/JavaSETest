package cn.itcast.iodemo;

import cn.itcast.model.People;
import org.junit.Test;

import java.io.*;

/**
 * @author : XU
 * @date : 2018/12/12 11:42
 */
public class ObjectStreamDemo {

@Test
    public  void writeObj() throws IOException {
        FileOutputStream fs = new FileOutputStream("E:\\javawork\\JavaSETest\\src\\main\\resources\\xuliehua.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fs);
        oos.writeObject(new People("ben",15,"boy"));
        oos.close();
        System.out.println("----------------");
    }
@Test
    public  void readObj() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("E:\\javawork\\JavaSETest\\src\\main\\resources\\xuliehua.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj =ois.readObject();
        System.out.println(obj);
        ois.close();
        System.out.println("----------------");
    }

}
