/*
 * 需求：
 *  定义一个整型数组，并对齐数据进行输出打印
 *
 * 思路：
 *  定义一个整型数组，并对齐数据进行输出打印
 */
public class ArrayDemo_002{
    public static void main(String[] args){
        //定义数组，存储整数，容器长度，3个
        
        int[] arr = new int[3];
        System.out.println(arr);

        //通过索引的方式，数组中的三个元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        System.out.println(arr.length);
    }
}
