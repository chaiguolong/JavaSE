package c.itcast.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 使用JDK1.5的接口Lock,替换同步代码块,实现线程安全性
 * Lock接口方法:
 *      lock()      获取锁
 *      unlock()    释放锁
 * 实现类ReentrantLock
 */
public class Tickets_002 implements Runnable{

    //定义出售的票源
    private int ticket = 100;

    //在类的成员位置,创建lock接口的实现类对象
    private Lock lock = new ReentrantLock();

    public void run(){
        while(true){
            //调用Lock接口方法lock()获取锁
            lock.lock();
            //对票数判断,大于0,可以出售,变量--操作
            if(ticket > 0){
                try{
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+" 出售第 " + ticket--);
                }catch(Exception ex){

                }finally{
                    lock.unlock();
                }
            }
        }
    }
}