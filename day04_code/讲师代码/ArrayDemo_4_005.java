/*
 * 需求：
 *  1.数组操作中两个异常
 *
 * 思路：
 *  1.数组操作中两个异常
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建数组，赋值并初始化
 *  3.输出打印越界元素
 *  4.新建数组
 *  5.输出打印数组元素
 *  6.将数组置空
 *  7.输出打印数组元素
 */
public class ArrayDemo_4_005{
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6};

        // System.out.println(arr[6]);//java.lang.ArrayIndexOutOfBoundsException: 6

        int[] arr2 = {1,3,4,5,6,7};

        System.out.println(arr[2]);

        arr2 = null;

        System.out.println(arr2[2]);//java.lang.NullPointerException
    }
}
