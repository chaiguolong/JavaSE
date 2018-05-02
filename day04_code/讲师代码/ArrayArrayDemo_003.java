/*
 * 需求：
 *  1.定义整型数组，并在控制台输出他们的值
 *
 * 思路：
 *  1.定义整型数组，并在控制台输出他们的值
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建整型数组
 *  3.输出整型数组到控制台
 *  4.输出整型数组的元素到控制台
 *  5.输出整型数组的长度到控制台
 */
public class ArrayArrayDemo_003{
    public static void main(String[] args){
        int[][] arr = new int[3][4];

        System.out.println(arr);

        System.out.println(arr[2]);

        System.out.println(arr[1][2]);

        System.out.println(arr.length);
    }
}
