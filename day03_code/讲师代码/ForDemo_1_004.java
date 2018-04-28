/*
 *  利用for循环，计算1-4的结果
 *思路： 1+2+3+4=10
 *
 * 步骤：通过for循环进行求和
 */
public class ForDemo_1_004{
    public static void main(String[] args){
        //定义变量，存储求和的值
        int sum = 0;
        //通过for循环，将变量从1变化到4
        for(int i=1; i<5; i++){
            //对变量进行求和
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
