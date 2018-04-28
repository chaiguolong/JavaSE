/*
 * 需求：
 *  1.分别用if语句和三元表达式判断两个整数，谁是最大值
 *
 * 思路：
 *  1.分别用if语句和三元表达式判断两个整数，谁是最大值
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义两个整型变量并赋值
 *  3.创建if..else..语句，通过判断，判断两个数的大小
 *  4.定义变量接受三元表达式的结果
 *  5.打印最大值
 */
public class IfElseDemo_1_005{
    public static void main(String[] args){
        int i = 30;
        int j = 49;
        if(i > j){
            System.out.println(i+" 是最大值");
        }else{
            System.out.println(j+" 是最大值");
        }


        int k = (i > j) ? i : j;
        System.out.println(k+" 是最大值");
    }
}
