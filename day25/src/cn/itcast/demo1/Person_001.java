package cn.itcast.demo1;

import java.io.Serializable;

public class Person_001 implements Serializable{
    public String name;
    public int age;
    //类,自定义了序列号,编译器不会计算序列号
    private static final long serialVersionUID = 12312421234123L;

    public Person_001(String name ,int age){
        super();
        this.name = name;
        this.age = age;
    }

    public Person_001(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    public String toString(){
        return "Person [name=" + name+"age"+ age +"]";
    }

}
