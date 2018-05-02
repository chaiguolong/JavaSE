/*
 * 需求：
 *  1.随机点名器，将数组中的名字随机取出，并打印出来
 *
 * 
 * 思路：
 *  1.通过Random类的方法，获取随机数，作为数组下标取出数组中的元素
 *
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.导入Ramdom包
 *  3.新建数组，赋值并初始化
 *  4.遍历数组，打印数组元素，用于预览
 *  5.新建类Random的变量，并获取在数组长度内的随机数
 *  6.通过数组的下表获取数组元素
 */
import java.util.Random;
public class CallName_004{
    public static void main(String[] args){
        String[] names = {"张三","李四","王五","李蕾","韩梅梅","小名","老王","小华","约翰逊","爱丽丝"};

        for(int i = 0 ; i < names.length ; i++){
            System.out.println(names[i]);
        }

        System.out.println("===========================");
        Random ran = new Random();

        int ranNumber = ran.nextInt(names.length);

        System.out.println(names[ranNumber]);
    }
}
