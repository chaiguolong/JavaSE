/*
 * 方法的定义练习
 */
import java.util.Scanner;
public class MethodDemo_1_003{
    public static void main(String[] args){
        int avg = getAvg(3,4,5);
        System.out.println(avg);
        printRect2(4,6);
        getNumber();
        printRect();
    }

    /*
     * 需求1：
     *  求三个整数的平均数
     * 返回值：int
     * 传递参数，int a ,int b ,int c
     */
    public static int getAvg(int a , int b , int c){
        return (a + b + c)/3;
    }

    /*
     * 需求2:
     *  打印置顶M行，每行N个*的矩形
     * 返回值: 无
     * 传递参数： int a , int b
     */
    public static void printRect2(int a ,int b){
        for(int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * 需求3：
     *  从键盘获得一个整数
     *  返回值类型：int
     *  传递参数：无
     */
    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /*
     * 需求4：
     *  定义一个3行3列的矩形*
     *  返回值：无
     *  传递参数：无
     */
    public static void printRect(){
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
