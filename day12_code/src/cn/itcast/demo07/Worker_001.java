package cn.itcast.demo07;
/*
 * 同时需要在创建工人对象就必须明确姓名和年龄
 * new Worker同时给出姓名和年龄
 * new Worker("ABC",20)
 */
public class Worker_001 extends Person{
    public Worker_001(String name,int age){
        super(name,age);
    }
}
