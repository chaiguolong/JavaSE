/*
 * 需求：
 *  1.随机输出定义数组中的名字
 *
 * 思路：
 *  1.根据随机数Random，作为数组的小标，随机获取数组列表中的名字
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.导包Random
 *  3.新建数组
 *  4.遍历数组，对数组中的名字进行预览
 *  5.获取随机类Random类对象，并获取随机数作为数组下标，随机数的范围为数组长度
 *  6.通过随机数获取数组列表的随机元素
 */
import java.util.Random;
public class CallName_002{
    public static void main(String[] args){
		String[] names = {"张三","李四","王五","李蕾","韩梅梅","小名","老王","小华","约翰逊","爱丽丝"};
        for(int i = 0 ; i < names.length ; i++){
            System.out.println(names[i]);
        }

        Random ran = new Random();

        int ranNumber = ran.nextInt(names.length);

        System.out.println(names[ranNumber]);



    }
}
