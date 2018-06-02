package cn.itcast.demo03;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1_002{
    public static void main(String[] args){
        function_3();
    }

    /*
     * Calendar类的get方法 获取日历字段的值 int get(int) 参数int,获取的哪个日历字段 返回值，
     * 就表示日历字段的具体数值
     */
    public static void function(){
        Calendar cal = Calendar.getInstance();
        //获取年份
        int year = cal.get(Calendar.YEAR);
        //获取月份
        int month = cal.get(Calendar.MONTH) + 1;
        //获取天数
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    /*
     * Calendar类的set方法，设置日历 set(int field ,int value) field 设置的是哪个日历字段
     * value设置后的具体数值
     *
     * set(int year,int month,int day)传递三个整数的年，月，日
     */
    public static void function_1(){
        Calendar cal = Calendar.getInstance();
        //设置,月份，设置到10月份
        //cal.set(Calendar.MONTH,9)
        
        //设置年,月,日
        cal.set(2009, 4, 1);

        //获取年份
        int year = cal.get(Calendar.YEAR);
        //获取月份
        int month = cal.get(Calendar.MONTH) + 1;
        //获取天数
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    /*
     * Calendar类方法add 日历的偏移量
     * 可以指定一个日历中的字段
     * 进行整数的偏移 add(int field, int value)
     */
    public static void function_2(){
        Calendar cal = Calendar.getInstance();
        //让日历中的天数，向后偏移365天
        cal.add(Calendar.DAY_OF_MONTH,-365);
        //获取年份
        int year = cal.get(Calendar.YEAR);
        //获取月份
        int month = cal.get(Calendar.MONTH);
        //获取天数
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    /*
     * Calendar类的方法getTime()
     * 把日历对象，转成Date日期对象
     */
    public static void function_3(){
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date);
    }

}
