package cn.itcast.ThreadDemo;

import java.util.stream.IntStream;

/**
 * @author : XU
 * @date : 2018/12/12 17:17
 */
public class SubThread extends  Thread {

    public SubThread() {
        super("子线程");
    }

    @Override
    public void run() {

        IntStream.range(0, 20).mapToObj(i -> Thread.currentThread().getName() + "run..." + i).forEach(System.out::println);
    }
}
