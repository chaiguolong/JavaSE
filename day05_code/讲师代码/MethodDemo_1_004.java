/*
 * 方法定义的练习
 */
import java.util.Scanner;
public class MethodDemo_1_004{
    public static void main(String[] args){
        //打印三个数的平均值
        System.out.println(getAvg(4,5,6));
        printRect2(5,6);
        int number = getNumber();
        System.out.println(number);
        printRect();
    }

    //1.求三个数的平均数
    //返回值类型：double
    //参数列表：int a ,int b ,int c
    public static double getAvg(int a , int b  ,int c){
        return a + b + c /3;
    }

    //2.打印指定M行*，每行有N个*
    //返回值类型：void
    //参数列表：int M ， int N
    public static void printRect2(int m ,int n){
        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //3.键盘录入得到一个整数
    //返回值类型：int
    //参数列表：空
    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //4.打印三行，没行有3个*
    //返回值列表：void
    //参数列表：空
    public static void printRect(){
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
