/*
 *  需求：利用for循环，计算1-4相加的结果
 *  思路：
 *      1.定义变量接受求和之后的结果：sum
 *      2.通过for循环中定义的变量，执行sum = sum + i
 *      3.通过System.out.println();输出到控制台
 */
public class ForDemo_1_003{
    public static void main(String[] args){
        //定义变量，记录求和后的数据
        int sum = 0;
        //利用循环，将变量从1变化到4
        for(int i = 1; i < 5; i++){
            //对变量进行求和
            sum = sum + i;
        }

        System.out.println(sum);
    }
}

