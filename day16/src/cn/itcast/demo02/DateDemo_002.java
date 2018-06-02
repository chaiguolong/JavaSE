package cn.itcast.demo02;

import java.util.Date;
/*
 * 时间和日期类
 *  java.util.Date
 *
 *  重要：时间和日期的计算，必须依赖毫秒值
 *  XXX-XXX-XX = 毫秒
 *
 *      long time = System.currentTimeMillis();
 *      System.out.println(time);
 */
public class DateDemo_002{
    public static void main(String[] args){
        function();
    }
    /*
     * Date类空参数构造方法
     * 获取到的是，当前操作系统中的时间和日期
     */
    public static void function(){
        Date date = new Date();
        System.out.println(date);
    }


    /*
     * Date类的long参数的构造方法
     * Date(long)表示毫秒值
     * 传递毫秒值，将毫秒值转成对应的日期对象
     */
    public static void function_1(){
        Date date = new Date(0);
        System.out.println(date);
    }

    /*
     * Date类方法getTime()返回值long
     * 返回的是毫秒值
     * 将Date表示的日期，转成毫秒值
     * 日期和毫秒值转换
     */
    public static void function_2(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
     * Date类方法   setTime(long)传递毫秒值
     * 将日期对象设置到指定的毫秒值上
     * 毫秒值转成日期对象
     * Date的构造方法
     */
    public static void function_3(){
        Date date = new Date();
        System.out.println(date);

        date.setTime(0);
        System.out.println(date);
    }
}
