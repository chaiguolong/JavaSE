/*
 * 需求：
 *  1.循环遍历数组中的元素
 *
 * 思路：
 *  1.for循环嵌套遍历数组中的元素
 *
 * 
 * 步骤：
 *  1.新建类和主函数
 *  2.定义数组变量并初始化
 *  3.新建for循环嵌套，打印输出数组元素
 */
public class ArrayArrayDemo_2_003{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,6,5,7},{3,7,9,1},{0}};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
