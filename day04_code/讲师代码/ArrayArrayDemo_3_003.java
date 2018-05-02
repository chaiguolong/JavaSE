/*
 * 需求：
 *  1.分别统计3个小组的销售额,并统计三个小组销售额之和
 *
 * 思路：
 *  1.将三个小组销售额，分别入录到一个二维数组，通过for循环嵌套，进行遍历
 *  2.在一维数组中之和就是每个小组的销售额，全部遍历之后的和为三个小组销售额之总和
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建一个二维数组，并将每个小组的销售额分别入录到二维数组中
 *  3.定义两个变量，分别为小组统计变量和总统计变量
 *  3.创建for循环嵌套语句，在内部循环，将每个一维数组循环结束后，其值在赋值给小组统计变量与总统计变量之后，对其清空，用于统计下一小组的数值
 */
public class ArrayArrayDemo_3_003{
    public static void main(String[] args){
        int[][] arr = {{11,12},{21,22,23},{31,32,33,34,35}};

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
