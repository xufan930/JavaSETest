package cn.itcast.ThreadDemo;

/**
 * @author : XU
 * @date : 2018/12/12 17:18
 */
public class ThreadTest {
    public static void main(String[] args) {
        SubThread st = new SubThread();
        SubThread st1 = new SubThread();
        Thread t1 = new Thread(() ->{
            for(int i = 0; i < 20;i++){
                System.out.println(Thread.currentThread().getName()+"run..."+i);
            }
        },"lambda线程");
        st1.start();
        t1.start();


    }
}
