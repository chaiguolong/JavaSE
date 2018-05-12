/*
 * 需求：实现随机点名器
 *  1.新建数组，存储姓名
 *  2.预览所有学生姓名，遍历数组
 *  3.随机数作为索引，到数组中找元素
 *  
 *  将功能独立出来，作成方法，调用方法即可
 *
 *  定义三个功能，用到同一个数组
 *  姓名存储到数组中，三个方法，使用一个数组中的数据，方法传递参数
 */
import java.util.Random;
public class CallName_005{
    public static void main(String[] args){
        //1.新建数组
        String[] names = new String[8];
        //2.调用新增姓名的方法
        addNames(names);
        //3.定义方法，预览所有学生姓名
        lookNames(names);
        //4.获取随机数，作为数组下标，从而获得随机姓名
        String name = RandomName(names);
        System.out.println("--------------------------");
        System.out.println(name);
    }

    //1.定义方法：获取随机姓名
    //返回类型：String name
    //参数列表：String[] names
    public static String RandomName(String[] names){
        Random ran = new Random();
        int ranNumber = ran.nextInt(names.length);
        return names[ranNumber];
    }

    //1.定义方法，预览所有学生姓名
    //2.返回类型：void
    //3.参数列表:String[] names
    public static void lookNames(String[] names){
        for(int i = 0 ; i <names.length ; i++){
            System.out.println(names[i]);
        }
    }

    //1.定义方法，新增姓名
    //2.返回类型：void
    //3.参数列表：String[] names
    public static void addNames(String[] names){
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "周六";
        names[4] = "张七";
        names[5] = "李八";
        names[6] = "韩梅梅";
        names[7] = "李磊";
    }


}
