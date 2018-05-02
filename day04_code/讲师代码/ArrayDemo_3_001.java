/*
 * 数组遍历：
 *  将所有的数组元素，全获取
 *  依靠索引，规律从0开始，一直在自增1，到达length-1
 *  循环来实现
 *      for     知道循环次数，计数器思想
 *      while   不确定循环次数
 */
public class ArrayDemo_3_001{
    public static void main(String[] args){
        int[] arr = new int[]{2,1,3,5,7,0};

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
