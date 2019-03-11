package cn.itcast.ThreadDemo;

import java.util.concurrent.Callable;

/**
 * @author : XU
 * @date : 2018/12/13 16:43
 */
public class MyCallable implements Callable<Integer> {
   int x;
   int y;
    public MyCallable(){

    }
    public MyCallable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() throws Exception {
        return x+y;
    }
}
