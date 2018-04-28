/*
 * 需求：
 *  1.实现猜数字的小游戏
 *
 * 思路：
 *  1.随意获取一个1-100的整数Random
 *  2.请用户输入一个1-100的整数Scanner
 *  3.将随意获取的整数与客户输入的整数进行比较判断，有三种结果
 *      1).大了     2).小了     3).相等(猜中了)
 *  4.通过while(true)一直猜，直到猜中为止，猜中了用break跳出循环
 * 
 * 步骤：
 *  1.导入Sanner和Random包
 *  2.创建类和主函数
 *  3.定义Random类变量，并通过nextInt(100)+1,获得随机的一个0-100的整数
 *  4.创建Scanner类变量
 *  5.提醒用户游戏开始了
 *  6.提醒用户请输入一个1-100的整数
 *  7.创建一个while(true)循环
 *  8.获取用户输入的整数
 *  9.判断用户输入的整数与随机获取的整数的大小，判断用户有没有猜对
 *  10.没有猜对，继续循环，猜对了用break跳出循环
 */
import java.util.Scanner;
import java.util.Random;
public class GuestNumber_005{
    public static void main(String[] args){
        Random ran = new Random();
        int ranNumber = ran.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字游戏开始了");
        System.out.println("请输入一个0-100的整数");

        while(true){
            int number = sc.nextInt();
            if(number > ranNumber){
                System.out.println("猜大了");
            }else if(number < ranNumber){
                System.out.println("猜小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }

    }
}
