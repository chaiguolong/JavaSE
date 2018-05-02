/*
 * 需求：
 *  1.数组操作中，常见的两个异常
 *
 * 思路:
 *  1.数组操作中，常见的两个异常
 *
 * 步骤:
 *  1.新建类和主函数
 *  2.新建数组，并赋值初始化
 *  3.输出数组中下表越界的元素
 *  4.重新定义一个新数组，并赋值初始化
 *  5.输出新数组中的元素
 *  6.将新数组赋值为null
 *  7.再次输出新数组中的元素
 */
public class ArrayDemo_4_003{
    public static void main(String[] args){
        // int[] arr = {1,3,4,5,6};
        // System.out.println(arr[5]);//java.lang.ArrayIndexOutOfBoundsException: 5

        int[] arr2 = {2,4,6,8,10};
        System.out.println(arr2[2]);
        arr2 = null;
        System.out.println(arr2[2]);//java.lang.NullPointerException

    }
}
