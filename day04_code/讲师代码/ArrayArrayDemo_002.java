/*
 * 需求：
 *  1.定义一个有三个长度为4的一维数组的二维数组,并打印输出该数组，该数组中的第二个一维数组，
 *  该数组中的第三个一维数组的第四个元素
 *
 * 思路：
 *  1.新建一个二维数组，并进行输出打印
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建一个二维数组
 *  3.打印该二维数组
 *  4.打印二维数组中的第二个一维数组
 *  5.打印二维数组中的第三个二维数组第四个元素
 */
public class ArrayArrayDemo_002{
    public static void main(String[] args){
        int[][] arr = new int[3][4];

        System.out.println(arr);

        System.out.println(arr[1]);

        System.out.println(arr[2][3]);
    }
}
