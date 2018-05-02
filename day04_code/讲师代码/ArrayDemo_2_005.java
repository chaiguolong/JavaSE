/*
 * 需求：
 *  1.数组的两种定义方式展示，并对数组进行取值，及长度打印
 *
 *
 * 思路：
 *  1.数组的两种定义方式展示，并对数组进行取值，及长度打印
 *
 * 步骤：   
 *  1.定义类和主函数
 *  2.定义数组方式一：
 *  3.打印数组长度及数组元素
 *  4.定义数组方式二
 *  5.打印数组长度及数组元素
 */
public class ArrayDemo_2_005{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};

        System.out.println(arr.length);

        System.out.println(arr[3]);


        int[] arr2 = {1,3,4,5,6,3,3,3,5,3,6,3};

        System.out.println(arr2.length);

        System.out.println(arr2[6]);
    }
}

