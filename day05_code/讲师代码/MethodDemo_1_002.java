/*
 * 方法的定义练习
 */
import java.util.Scanner;
public class MethodDemo_1_002{
    public static void main(String[] args){
        printRect();
        System.out.println(getNumber());
        printRect2(3,5);
        double avg = getAvg(2,2,3);
        System.out.println(avg);
    }

    public static double getAvg(double a , double  b , double c){

        return (a + b + c)/3;
    }

    public static void printRect2(int a , int b ){
        for(int i = 0 ; i <= a ; i++){
            for (int j = 0 ; j <= b ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    public static void printRect(){
        for(int i = 0 ; i <= 3 ; i++){
            for(int j = 0 ; j <= 3 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
