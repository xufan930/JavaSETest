package com.xf.company;

/**
 * @Auther: XU
 * @Date: 2018/10/9 18:02
 * @Description:
 */
public class Test2 {
    public static String test() {
        try {
            int i=0;
            if(i==0) {
                throw new RuntimeException("e1");
            }
        } catch (Exception e) {
            throw new RuntimeException("e2");
        } finally {
            return "r1";
        }
    }

}
