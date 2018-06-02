package cn.itcast.demo03;

import java.util.Calendar;

/*
 * 日历类 java.util.Calendar
 * 抽象类，使用它的子类对象
 *
 * Calendar类写了静态方法 getInstance() 直接返回了子类的对象
 * 不需要new 子类的对象，通过静态方法直接获取
 */
public class CalendarDemo_002{
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
    }
}
