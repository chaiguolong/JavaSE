/*
 * 需求：
 *  1.定义一个数组，并输出其数组及其元素
 *
 * 思路：
 *  1.定义一个数组，并输出其数组及其元素
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建数组
 *  3.输出数组及数组元素
 */
public class ArrayDemo_003{
    public static void main(String[] args){
        int[][] arr = new int[3][4];

        System.out.println(arr);

        System.out.println(arr[2]);

        System.out.println(arr[2][1]);
    }
}
