/*
 * 需求：
 *  1.判断新定义一个变量为5的整数，在if判断中的条件是否>5,
 *      如果大于5，输出"if中的条件是true",并对变量加1
 *      如果不大于5，打印该整数
 *
 *  思路：
 *      1.写一个if判断，通过System.out.println();进行判断
 *
 *
 *  步骤：
 *      1.新建类和主函数
 *      2.定义一个整数5
 *      3.创建判断语句
 *      4.如果大于5，if执行体输出if中的条件是true，并对变量加1
 *      5.如果不大于5，在判断语句外打印输出该变量
 */
public class IfDemo_005{
    public static void main(String[] args){
        int i = 5;
        if(i > 5){
            System.out.println("if中的条件是true");
            i++;
        }
        System.out.println(i);
    }
}
