package cn.itast.demo03;
/*
 * 定义Person类，
 * 定义对象的特有数据，和对象的共享数据
 * 对象的特有数据(非静态修饰) 调用者只能是 New 对象
 * 对象的共享数据(静态修饰) 调用者可以是new对象，可以使类名
 *
 * 被静态修饰的成员，可以被类名字直接调用
 */
public class Person_001{

    String name;

    static String className;

}
