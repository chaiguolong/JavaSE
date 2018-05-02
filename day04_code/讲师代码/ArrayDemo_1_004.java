/*
 * 需求：
 *  1.使用索引，对数组进行赋值和取值
 *
 * 思路:
 *  1.使用索引，对数组进行赋值和取值.
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建数组
 *  3.对数组元素进行赋值
 *  4.打印数组元素
 */
public class ArrayDemo_1_004{
    public static void main(String[] args){
        int[] arr = new int[5];

        arr[2] = 3;

        System.out.println(arr[1]);

        System.out.println(arr[2]);
    }
}
