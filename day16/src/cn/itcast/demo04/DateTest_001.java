package cn.itcast.demo04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest_001{
    public static void main(String[] args) throws Exception{
        function();
    }

    /*
     * 闰年计算
     * 2000 3000
     * 高级算法：日历设置到指定年份的3月1日，add向前偏移1天，获取天数，29闰年
     */
    public static void function_1(){
        Calendar cal = Calendar.getInstance();
        //将日历，设置到指定年的3月1日
        cal.set(2088, 2, 1);
        //日历add方法，向前偏移一天
        cal.add(Calendar.DAY_OF_MONTH, -1);
        //get方法获取天数
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    /*
     * 计算活了多少天
     * 生日 今天的日期
     * 两个日期变成毫秒数，减法
     */
    public static void function() throws Exception{
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        //获取出生日期，键盘输入
        String birthdayString = new Scanner(System.in).next();
        //将字符串日期，转成Date对象
        //创建SimpleDateFormat对象，写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //调用方法parse,字符串转成Date对象
        Date birthdayDate = sdf.parse(birthdayString);
        //获取今天的日期对象
        Date todayDate = new Date();
        //将两个日期转成毫秒数
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long second = todaySecond - birthdaySecond;

        if(second < 0){
            System.out.println("还没出生呢");
        }else{
            System.out.println(second/1000/60/60/24);
        }
    }
}
