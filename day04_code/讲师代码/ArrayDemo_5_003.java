/*
 * 需求：
 *  1.计算数组中的最大值
 *
 * 思路：
 *  1.先定义一个变量，默认最大值，然后遍历数组和该默认值比较，若大于该默认最大值，则将该值赋值给
 *  默认最大值，直到遍历循环结束
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.新建数组
 *  3.定义一个默认最大值变量
 *  4.变量新建的数组，并与默认最大值比较
 */
public class ArrayDemo_5_003{
    public static void main(String[] args){
        int[] arr = {21,32,22,43,33,56,76,122,34,55};
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
