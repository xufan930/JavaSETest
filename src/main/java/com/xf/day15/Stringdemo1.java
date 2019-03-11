package com.xf.day15;

import java.math.BigDecimal;

/**
 * @Auther: XU
 * @Date: 2018/11/5 15:33
 * @Description:
 */
public class Stringdemo1 {

    public static void main(String[] args) {
       /* String str = new String(new char[]{'n','i','h','a','o'});
        System.out.println(str);
        System.out.println(str.substring(0, 2));
        System.out.println(str.startsWith("ni"));
        System.out.println(str.contains("ha"));
        System.out.println(str.getBytes()[1]);
        System.out.println(str.equalsIgnoreCase("NIHAO"));

        *//*---------------------------------------------------------------------------------*//*
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.length());
        stringBuffer.append("abcdefg");
        stringBuffer.reverse();
        stringBuffer.replace(0, 2, "o");
        stringBuffer.toString();
        System.out.println(stringBuffer);*/
       /* String abc = "头部";
        String[] a = abc.split("/");
        System.out.println(Arrays.toString(a));
        String gg = "http://116.62.179.17:8080/swagger-ui.html#/task-medical-audit-controller/queryMedicalAuditTaskPageByConditionUsingPOST";
        System.out.println(gg);*/
       int a =1;
       int b =99996;
        double c = (100-(double)a*100/b);
        System.out.println(c);
      /*  DecimalFormat df=new DecimalFormat("0.0");
        System.out.println(df.format((double)(100-a*100/b)));
        double c = (100-(double)a*100/b);
        System.out.println(c);*/
        BigDecimal bg = new BigDecimal((100-(double)a*100/b));
        double f1 = bg.setScale(1, BigDecimal.ROUND_DOWN).doubleValue();
        System.out.println(f1);
    }
}
