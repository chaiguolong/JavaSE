/*
 * 需求：
 *  1.从键盘获取一个随机整数和一个随机字符串
 *
 * 思路：
 *  1.通过工具类Scanner获取获取随机数和字符串的方法：nextInt()和next();
 *
 * 步骤：
 *  1.创建类和主函数
 *  2.导入Scanner类
 *  3.创建Scanner类变量，调用nextInt()方法和next()方法获取随机整数和随机字符串
 *  4.打印出整数和字符串
 */
import java.util.Scanner;
public class ScannerDemo_005{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);

        String s = sc.next();
        System.out.println(s);
    }
}
