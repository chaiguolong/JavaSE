package cn.itcast.demo1;
/*
 * 每个线程,都有自己的名字
 * 运行方法main线程,名字即使"main"
 * 其他新建的线程也有名字,默认"Thread-1","Thread-1"
 *
 * JVM开启主线程,运行方法main,主线程也是线程,是线程必然就是Thread类对象
 * Thread类中,静态方法
 * static Thread currentThread()返回正在执行的线程对象
 */
public class ThreadDemo_001{
    public static void main(String[] args){
        NameThread nt = new NameThread();
        nt.setName("旺财");
        nt.start();

        System.out.println(Thread.currentThread().getName());
    }
}
