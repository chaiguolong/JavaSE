/*
 * 需求：
 *  1.通过两种方式定义2个数组
 *
 *
 * 思路：
 *  1.通过两种方式定义2个数组.
 *
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建数组并初始化
 *  3.输出数组长度及数组元素
 *  4.新建数组并初始化
 *  5.输出数组长度及数组元素
 */
public class ArrayDemo_2_004{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(arr.length);

        System.out.println(arr[2]);

        int[] arr2 = {6,7,8,9,0};

        System.out.println(arr2.length);

        System.out.println(arr2[2]);
    }
}
