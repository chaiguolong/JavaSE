/*
 * 实现猜数字游戏
 *  随机数一个数字，让用户猜
 *  结果有三种情况
 *      中了，大了，小了
 *
 *  随机数：Random
 *  键盘输入：Scanner
 *  猜的数字，和随机数进行比较 if判断
 *  直到猜中为止，反复屈才，循环 while
 *
 *
 *需求：猜数字小游戏
 *
 *
 * 思路：
 *      1.随机获取一个数字
 *      2.用户输入一个数字
 *      3.将用户输入的数字和随机的数字进行比较判断
 *      4.通过while进行直到循环,死循环,直到猜中了通过break跳出循环
 */
import java.util.Random;
import java.util.Scanner;
public class GuestNumber_003{
    public static void main(String[] args){
        System.out.println("猜数字游戏开始了");
        System.out.println("请输入一个1-100的整数");
        //定义一个Random类变量
        Random ran = new Random();
        //通过Random变量获得一个随机数
        int ranNumber = ran.nextInt(100)+ 1;
        System.out.println(ranNumber);
        //请用户输入一个数字
        //定义一个Scanner类变量
        Scanner sc = new Scanner(System.in);
        //请用户输入一个整数
        
        while(true){
            int scNumber = sc.nextInt();
            //判断scNumer和scNumber的大小
            if(scNumber > ranNumber){
                System.out.println("你输入的数字太大了");
            }else if(scNumber < ranNumber){
                System.out.println("你输入的数字太小了");
            }else{
                System.out.println("你猜中了");
                //猜中跳出循环
                break;
            }
        
        }
    }
}
