/*
 * 需求：
 *  演示do..while..语句，展示其特点：无条件鲜执行一次
 *  举例：用do..while..语句打印0-4
 *
 * 思路：
 *  1.通过do..while循环+System.out.println();输出打印0-4
 *
 * 步骤：
 *  1.创建一个类————DoWhileDemo_005
 *  2.创建主函数
 *  3.定义一个整型变量
 *  4.创建do..while..
 */
public class DoWhileDemo_005{
    public static void main(String[] args){
        int i = 0;

        do{
            System.out.println(i);
            i++;
        }while(i < 5);

    }
}
