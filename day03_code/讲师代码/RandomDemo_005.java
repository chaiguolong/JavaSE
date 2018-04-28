/*
 * 需求：
 *  1.创建一个随机0-100的整数和创建一个随机的小数
 *
 * 思路：
 *  1.通过工具类Random类中的nextInt(100)和nextDouble()获得随机数
 *
 *
 * 步骤：
 *  1.创建类和主函数
 *  2.引入包
 *  3.创建Random类变量，并通过nextInt(100)和nextDouble()创建随机整数和随机小数
 *  4.打印
 */
import java.util.Random;
public class RandomDemo_005{
    public static void main(String[] args){
        Random ran = new Random();
        int ranNumber = ran.nextInt(100);
        System.out.println(ranNumber);

        double ranNumber2 = ran.nextDouble();
        System.out.println(ranNumber2);
    }
}
