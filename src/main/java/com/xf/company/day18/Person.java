package com.xf.company.day18;

/**
 * @Auther: XU
 * @Date: 2018/11/7 16:01
 * @Description:
 */
public class Person {
    private  String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
