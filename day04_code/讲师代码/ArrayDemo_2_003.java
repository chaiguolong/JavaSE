/*
 * 需求：
 *  1.数组的两种定义方式，并输出数组长度和数组元素
 *
 * 思路：
 *  1.数组的两种定义方式，并输出数组长度和数组元素
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.按照方式1，定义数组并赋值初始化
 *  3.输入数字长度，和数组元素的值
 *  4.按照方式2，定义数组并赋值初始化
 *  5.输出数组长度，和数组元素的值
 */
public class ArrayDemo_2_003{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr.length);
        System.out.println(arr[2]);

        int[] arr2 = {3,2,1,4,8,7,54,32};
        System.out.println(arr2.length);
        System.out.println(arr2[3]);
    }
}
