/*
 * 需求：
 *  1.二维数组遍历求和，新建二维数组，对每一个一维数组及二维数组求和
 *
 * 思路：
 *  1.对二维数组用for循环遍历，用叠加法进行求和，内层循环对一维数组循环，外层循环对二维数组循环
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建二维数组
 *  3.新建二维数组的求和变量，sum和，groupSum
 *  4.新建for嵌套循环
 *  5.在内层循环控制每个一维数组的数量，进行叠加法求和，完成之后不需换行
 *  6.在外层循环将内层循环的值再次叠加，求二维数组总和，之后清空一维数组的和
 */
public class ArrayArrayDemo_3_005{
    public static void main(String[] args){
        int[][] arr = {{1,2,3,},{4,5,6},{7,8,9}};

        int sum = 0;
        int groupSum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                groupSum = groupSum + arr[i][j];
            }

            System.out.println(groupSum);

           sum = sum + groupSum;

           groupSum = 0;
        }

        System.out.println(sum);
    }
}
