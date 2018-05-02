/*
 * 需求：
 *  1.从姓名数组数组中随机获取该数组的元素,即：随机点名器
 *
 * 思路：
 *  1.通过Random类，获取随机数，将该数作为数组小标，获取数组的元素，即对人名进行随机点名
 *
 * 步骤：
 *  1.新建类和主函数
 *  2.导包，Random
 *  3.新建人名数组，并赋值初始化
 *  4.遍历姓名数组，对该数组进行遍历预览
 *  5.打印分隔符
 *  6.新建Random类变量，并生成范围在arr.length内的随机数
 *  7.将随机数作为数组下标，访问数组元素
 */
import java.util.Random;
public class CallName_003{
    public static void main(String[] args){
        String[] names = {"张三","李四","王五","李蕾","韩梅梅","小名","老王","小华","约翰逊","爱丽丝"};
        for(int i = 0 ; i < names.length ; i++){
            System.out.println(names[i]);
        }

        System.out.println("----------------------------");

        Random ran = new Random();

        int ranNumber = ran.nextInt(names.length);

        System.out.println(names[ranNumber]);

    }
}
