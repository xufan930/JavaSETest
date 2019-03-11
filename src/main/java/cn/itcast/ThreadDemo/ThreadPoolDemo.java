package cn.itcast.ThreadDemo;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author : XU
 * @date : 2018/12/13 16:23
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
       // Myrunnable myrunnable = new Myrunnable();
        /*service.submit(myrunnable);
        service.submit(myrunnable);
        service.submit(myrunnable);
        service.submit(myrunnable);
        service.submit(myrunnable);
        service.shutdown();
*/
        MyCallable c = new MyCallable(100, 200);
        MyCallable c2 = new MyCallable(10, 20);
         Future<Integer> s1 = service.submit(c);
        System.out.println(s1.get());
        Future<Integer> s2 = service.submit(c2);
        System.out.println(s2.get());

    }
}
