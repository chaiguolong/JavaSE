/*
 * 方法定义练习
 *
 */
import java.util.Scanner;
public class MethodDemo_1_005{
    public static void main(String[] args){
        double avg = getAvg(4,5,6);
        printRect2(8,9);
        getNumber();
        printRect();
    }

    /*
     * 求三个数的平均数
     * 返回值类型：double
     * 参数列表：int a ,int b , int c
     */
    public static double getAvg(int a ,int b ,int c){
        return a + b + c / 3;
    }

    /*
     * 打印指定m行，每行n个*
     * 返回值类型：void
     * 参数列表：int a ,int b
     */
    public static void printRect2(int a ,int b ){
        for(int i = 0 ; i <= a ; i++){
            for(int j = 0 ; j <= b ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * 键盘录入得到一个整数
     * 返回值类型：int
     * 参数列表：空
     */
    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /*
     * 打印3行，每行3个*号的矩形
     * 返回值类型：void
     * 参数列表：空
     */
    public static void printRect(){
        for(int i = 0 ; i <= 3; i++){
            for(int j = 0 ; j <= 3 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
