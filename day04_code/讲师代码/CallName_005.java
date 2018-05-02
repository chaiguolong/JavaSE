/*
 * 需求：随机点名器
 * 1.将数组中的数字随机取出
 *
 * 思路：
 *  1.通过Random类获取的随机数作为下标，取出数组中的元素
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.定义数组，赋值并初始化
 *  3.遍历数组，用于预览
 *  4.新建Random类，通过方法获取随机数(在数组长度范围内)
 *  5.将获取的随机数作为下标，通过数组打印输出
 */
import java.util.Random;
public class CallName_005{
    public static void main(String[] args){

        String[] names = {"张三","李四","王五","李蕾","韩梅梅","小名","老王","小华","约翰逊","爱丽丝"};

        for(int i = 0 ; i < names.length ; i++){
            System.out.println(names[i]);
        }

        System.out.println("-----------------------------------");
        Random ran = new Random();

        int ranNumber = ran.nextInt(names.length);

        System.out.println(names[ranNumber]);

    }
}
