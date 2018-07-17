package cn.itcast.demo5;

public class ThreadPoolRunnable_002 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " 线程提交任务");
    }
}
