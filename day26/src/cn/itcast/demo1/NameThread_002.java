package cn.itcast.demo1;
/*
 *  获取线程名字,父类Thread方法
 *  String getName()
 */
public class NameThread_002 extends Thread{

    public NameThread_002(){
        super("小强");
    }

    public void run(){
        System.out.println(getName());
    }

}
