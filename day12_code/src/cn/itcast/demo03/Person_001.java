package cn.itcast.demo03;
/*
 * this可以在构造方法之间进行调用
 * this.的方式，区分局部变量和成员变量同名情况
 * this在构造方法之间的调用，语法this()
 */
public class Person_001{
    private String name;
    private int age;

    public Person_001(){
        //调用了有参数的构造方法
        //参数李四，20传递给了变量name，age
        this("李四",20);
    }

    /*
     * 构造方法，传递String,int
     * 在创建对象的同时为成员变量赋值
     */
    public Person_001(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void set(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
