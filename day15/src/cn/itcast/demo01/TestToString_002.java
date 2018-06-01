package cn.itcast .demo01;

import java.util.*;
public class TestToString_002{
    public static void main(String[] args){
        //调用Person类的方法toString()
        //输出语句中，写的是一个对象，默认调用对象的toString方法
        Person p = new Person("张三",20);
        String s = p.toString();
        System.out.println(p);
        System.out.println(s);

        Random r = new Random();
        System.out.println(r.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.toString());
    }
}
