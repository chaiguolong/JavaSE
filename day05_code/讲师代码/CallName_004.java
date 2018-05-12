/*
 * 需求：实现随机点名器
 *      1.新建一数组，存储所有的姓名
 *      2.遍历数组，预览姓名
 *      3.通过random类获取随机数，作为数组下标获取随机姓名
 *
 * 要求，将功能独立出来
 */
import java.util.Random;
public class CallName_004{
    public static void main(String[] args){
        //1.新建数组，实现存储数据至数组
        String[] names = new String[8];
        addName(names);
        //2.遍历数组,预览姓名
        lookNames(names);
        System.out.println("---------------------------------");
        //3.通过random类，获取随机数，作为数组小标获取随机姓名
        randomGetName(names);
    }

    public static void randomGetName(String[] names){
        Random ran = new Random();
        int ranNumber = ran.nextInt(names.length);
        System.out.println(names[ranNumber]);

    }

    public static void addName(String[] names){
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "周六";
        names[4] = "黄七";
        names[5] = "韩八";
        names[6] = "张九";
        names[7] = "李十";
    }

    public static void lookNames(String[] names){
        for(int i = 0 ; i < names.length  ; i++){
            System.out.println(names[i]);
        }
    }
}
