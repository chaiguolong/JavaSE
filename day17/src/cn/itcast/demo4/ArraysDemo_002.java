package cn.itcast.demo4;

import java.util.Arrays;
/*
 * 数组的工具类，包含数组的操作
 * java.util.Arrays
 */
public class ArraysDemo_002{
    public static void main(String[] args){
        function();
        int[] arr = {56,65,11,98,57,43,16,18,100,200};
        int[] newArray = test(arr);
        System.out.println(Arrays.toString(newArray));
    }
    /*
     * 定义方法，接受输入，存储的是10个人的考试成绩
     * 价格最后三个人的成绩，存储到新的数组中，返回新的数组
     */
    public static int[] test(int[] arr){
        //对数组排序
        Arrays.sort(arr);
        //将最后三个成绩存储到新的数组中
        int[] result = new int[3];
        //成绩数组的最后三个元素，复制到新数组中
        //System.arraycopy(arr,0,resutl,0,3);
        for(int i = 0; i < 3; i++){
            result[i] = arr[i];
        }

        return result;
    }
    /*
     * static String toString(数组)
     * 将数组变成字符串
     */
    public static void function_2(){
        int[] arr = {5,1,4,6,8,9,0};
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
    
    /*
     * static int binarySearch(数组，被查找的元素)
     * 数组的二分搜索法
     * 返回元素在数组中出现的索引
     * 返回元素不存在，返回的是（-插入点-1)
     */
    public static void function_1(){
        int[] arr = {1,4,7,9,11,15,17,19};
        int index = Arrays.binarySearch(arr,11);
        System.out.println(index);
    }

    /*
     * static void sort(数组)
     * 对数组升序排列
     */
    public static void function(){
        int[] arr = {5,1,4,3,2,7,8};
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
