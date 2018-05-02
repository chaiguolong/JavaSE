/*
 * 需求：
 *  1.二维数组遍历求和。分别对三个小组的销售额和总销售额进行求和
 *
 *
 * 思路：
 *  1.利用for循环对二维数组进行循环求和，在内循环中，求每个一维数组的和，
 *  在外循环求总和。
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建二维数组并赋值初始化
 *  3.创建2个变量用以保存求和的值
 *  4.创建for嵌套循环，在内循环对每组求和，并赋值给总金额求和后，对每组求和变量清零，用以保存
 *  新的小组的求和
 */
public class ArrayArrayDemo_3_004{
    public static void main(String[] args){
        int[][] arr = {{11,21,31},{21,22,23},{31,32,33},{41,42,43,44}};

        int sumGroup = 0;
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                sumGroup = sumGroup + arr[i][j];
            }

            System.out.println(sumGroup);
            
            sum = sum + sumGroup;

            sumGroup = 0;
        }

        System.out.println(sum);
    }
}
