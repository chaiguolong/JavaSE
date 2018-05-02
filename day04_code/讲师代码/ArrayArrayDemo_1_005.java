/*
 * 需求：
 *  1.定义二维数组,并打印二维数组中的元素
 *
 * 思路：
 *  1.定义二维数组,并打印二维数组中的元素.
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建二维数组，赋值并初始化
 *  3.通过下标输出打印二维数组元素
 */
public class ArrayArrayDemo_1_005{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{2,3,4},{4,5,6}};

        System.out.println(arr[1][2]);

        System.out.println(arr[2][1]);
    }
}
