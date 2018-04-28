/*
 * 循环语句：可以让一部分代码，反复执行
 *
 * while循环：
 *      编写格式：
 *
 *      while(条件){
 *          循环体
 *      }
 *      条件：当条件是true，就执行循环体，执行完循环体后
 *      程序再次执行while条件，如果条件还是true，继续执行循环体
 *      直到条件是false的时候，循环就结束
 */
public class WhileDemo_002{
    public static void main(String[] args){
        //输出1-4之间的整数
        //1.定义变量
        //2.通过while循环自增i
        //3.通过System.out.println();输出到控制台
        int i = 1;
        while(i < 5){
            System.out.println(i);
            i++;
        }
    }
}
