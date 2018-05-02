/*
 * 需求：
 * 1.展示数组操作中容易产生的两个异常,数组越界及空指针
 *
 * 思路：
 * 1.展示数组操作中容易产生的两个异常
 *
 * 步骤
 *  1.新建类和主函数
 *  2.新建数组，初始化该数组及赋值
 *  3.打印数组元素，越界
 *  4.新建数组，初始化该数组及赋值
 *  5.打印数组中的元素
 *  6.将数组置为空
 *  7.重新打印该数组元素
 */
public class ArrayDemo_4_004{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        //System.out.println(arr[6]);//java.lang.ArrayIndexOutOfBoundsException: 6

        int [] arr2 = {1,2,3,4,5,6,7,8};

        System.out.println(arr[4]);

        arr2 = null;

        //System.out.println(arr2[4]);//java.lang.NullPointerException
    }
}
