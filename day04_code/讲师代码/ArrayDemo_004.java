/*
 * 需求：
 *  1.定义一整型数组，并打印该数组及其该数组的元素
 *
 *
 * 思路：
 *  1.定义一整型数组，并打印该数组及其该数组的元素
 *
 *
 * 步骤：
 *  1.创建类和主函数
 *  2.创建数组
 *  3.打印数组
 *  4.打印数组元素
 */
public class ArrayDemo_004{
    public static void main(String[] args){
        int[][] arr = new int[4][5];

        System.out.println(arr);

        System.out.println(arr[2][3]);

        System.out.println(arr[3][3]);

        System.out.println(arr.length);
    }
}
