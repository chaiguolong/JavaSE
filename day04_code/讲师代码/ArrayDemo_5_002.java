/*
 * 计算数组中的最大值
 * 数组{4，1，7，5};作比较
 *
 * 需求：
 *  1.给定一个数组，找出其中的最大值
 *
 * 
 * 思路：
 *  1.新建类和主函数
 *  2.定义一个数组
 *  3.定义一个变量，默认最大值
 *  4.遍历数组，每个数组元素都与默认元素比较，若大于默认变量，则将该数组元素赋值给默认变量
 *  直到循环结束
 *
 */
public class ArrayDemo_5_002{
    public static void main(String[] args){
        int[] arr = {5,3,6,8,55,67,33,22,43,55};
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("数组最大值为: " + max);
    }
}
