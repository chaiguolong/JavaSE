/*
 * 需求：
 *  1.计算数组中的最大值
 *
 *
 * 思路：
 *  1.遍历数组，与默认值比较，大于默认值赋值给默认值，直到遍历结束
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义默认最大值
 *  3.新建数组，赋值并初始化
 *  4.遍历数组，并与默认值比较
 */
public class ArrayDemo_5_005{
    public static void main(String[] args){
        int max = 0;
        int[] arr = {3,4,3,66,553,223,5554,23,223,123,33};

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
