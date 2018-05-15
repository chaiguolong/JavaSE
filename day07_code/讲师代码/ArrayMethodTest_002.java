/*
 * 利用嵌套for循环，实现99乘法表
 * 定义方法，实现数组的遍历
 * 遍历中，输出结果 【11，22，565，66，78，89】
 * int[] arr = {3,4,45,32,7};
 * 结果包含字符串,[],
 *
 * 实现步骤：
 *  1.  定义方法实现数组的遍历
 *  2.  先打印[中括号
 *  3.  遍历数组
 *      输出数组中的元素和逗号
 *      判断是否遍历到了数组的最后一个元素，如果是最后一个元素，输出]中括号
 */
public class ArrayMethodTest_002{
    public static void main(String[] args){
        int[] arr = {11,44,55,33,66};
        printArray(arr);
    }

    /*
     * 定义方法，实现功能
     * 返回值：void
     * 方法参数：数组
     */
    public static void printArray(int[] arr){
        //输出一般中括号，不要打印换行
        System.out.print("[");
        //数组遍历
        for(int i = 0 ; i < arr.length ; i++){
            //判断遍历到的元素，是不是数组的最后一个元素
            //如何判断  循环变量    到达    length - 1
            if( i == arr.length -1 ){
                //输出数组的元素和]
                System.out.print(arr[i]+"]");
            }else{
                //不是数组的最后一个元素，输出数组元素和逗号
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }
}
