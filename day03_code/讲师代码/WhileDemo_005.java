/*
 * 需求：
 *  1.输出1-4之间的整数
 * 
 *
 * 思路：
 *  1.通过while循环输出1-4之间的整数
 * 
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义整型变量并赋值初始化
 *  3.新建while循环
 *  4.输出打印整数
 */
public class WhileDemo_005{
    public static void main(String[] args){
        int i = 1;
        while(i < 5){
            System.out.println(i);
            i++;
        }
    }
}
