/*
 * 实现猜数字的小游戏
 *  随机数一个数字，让用户猜
 *  结果又三种：
 *  中了，大了，小了
 *
 *  随机数：Random
 *  键盘输入：Scanner
 *  猜的数字，和随机数进行比较，if判断
 *  直到猜中为止，用while（true）
 *
 *
 *  需求：
 *      实现猜数字小游戏
 *
 *
 *  思路：
 *      1.随机获取一个数字Random，让用户猜
 *      2.请用户输入一个整数Scanner
 *      3.通过if比较用户输入的数字和随机获得的数字:有三种情况：大了，小了，相等（猜中了）
 *
 *  步骤：
 *      新建一个类
 *      新建一个主方法
 *      先导入需要引入的包
 *      1.通过Random类，定义一个Random类变量
 *      2.通过Random类变量，调用nextInt（100）+1，获取1-100之间的随机数
 *      3.通过Scanner类，定义Scanner类变量
 *      4.提醒用户猜数字游戏开始了
 *      5.提醒用户请输入一个1-100的整数
 *      6.通过while（true）死循环，让游戏一直继续
 *      7.通过scanner类变量，调用nextInt（）方法，获取用户输入的整数
 *      8.通过if判断，比较两个变量的大小，判断有没有猜中，若猜中通过break跳出循环，若没有继续猜
 */
import java.util.Random;
import java.util.Scanner;
public class GuestNumber_004{
    public static void main(String[] args){
        Random ran = new Random();

        int ranNumber = ran.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("猜数字游戏开始了");

        System.out.println("请输入一个1-100的整数");

        while(true){
            int number = sc.nextInt();

            if(number > ranNumber){
                System.out.println("太大了");
            }else if(number < ranNumber){
                System.out.println("太小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }

    }
}
