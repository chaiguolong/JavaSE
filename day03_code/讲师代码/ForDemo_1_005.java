/*
 * 需求：
 *  利用for循环，计算1+2+3+4的结果
 *
 * 思路：
 *  1.for循环迭代变量值，不断相加,并输出到控制台
 *
 * 步骤：
 *  1.定义变量接受求和的结果
 *  2.创建for循环迭代变量
 *  3.将变量与之前迭代的结果相加
 *  4.将结果输出到控制台
 */
public class ForDemo_1_005{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1 ; i < 5 ; i++){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
