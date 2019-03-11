package cn.itcast.Copy;

/**
 * @author : XU
 * @date : 2019/1/4 16:18
 */
public class CloneTest {
    public static void main(String[] args) {
        People p = new People();
        Dog d = new Dog();
        d.setName("abc");
        p.setDog(d);

     People pp = new People();
      BeanCopyUtils.copyNotNull(p, pp);
     d.setName("qwe");
        System.out.println(pp);

    }
}
