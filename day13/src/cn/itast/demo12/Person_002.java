package cn.itast.demo12;
/*
 * 静态代码块，只执行一次
 * 构造代码块，new一次，就执行一次，优先于构造方法
 * 构造方法，new一次，就执行一次
 */
public class Person_002{
    private String name;
    private int age;

    public Person_002(String name ,int age){
        this.age = age;
        this.name = name;
        System.out.println("我是构造方法");
    }

    {
        System.out.println("我是构造代码块");
    }

    static{
        System.out.println("我是静态代码块");
    }
}
