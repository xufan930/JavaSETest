package com.xf.company.day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: XU
 * @Date: 2018/11/7 16:01
 * @Description:
 */
public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("小强"));
        list.add(new Person("老王"));
        list.add(new Person("小虎"));
        list.add(new Person("小泽"));
        list.add(new Person("小红"));
        for(int i=0; i<list.size(); i++){
            Person p = list.get(i);
            System.out.println(p);
        }

        function_3();
        List<String> linkedList = new LinkedList<String>();
    }
    private static void function_3(){
        Collection<String> coll = new ArrayList<>();
        coll.add("abc");
        coll.add("money");
        coll.add("itcast");
        coll.add("itheima");
        coll.add("money");
        coll.add("123");
        System.out.println(coll);

        boolean b = coll.remove("money");
        System.out.println(b);
        System.out.println(coll);
    }
}
