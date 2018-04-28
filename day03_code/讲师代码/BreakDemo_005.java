/*
 * 需求:
 *  演示break关键字的作用
 *  案例:
 *      while循环运行2000次,变量等于3的时候跳出循环,其他时候打印变量
 *
 * 思路:
 *  1.运行2000次while循环，当变量为3时，用break跳出循环
 *  2.不满足判断是用System.out.println();打印输出
 *
 *
 * 步骤:
 *  1.新建一个类————BreakDemo_005
 *  2.新建一个主方法
 *  3.定义一个int变量
 *  4.创建一个循环为2000次的while循环
 *  5.循环做出判断，当等于3时，用break跳出循环
 *  6.在判断外部用System.out.println();输出其他情况
 */
public class BreakDemo_005{
    public static void main(String[] args){
        int i = 0;
        while(i < 2000){
            if(i == 3){
                break;
            }
            i++;
            System.out.println(i);
        }
    }
}
