/*
 * 需求：
 *  1.存储所有学生姓名
 *  2.预览所有学生姓名，遍历数组
 *  3.随机数作为索引，到数组中找元素
 *
 *  将功能独立出来，作成方法，调用方法即可
 *
 *  定义三个功能，用到同一个姓名数据
 *  姓名存储到数组中，三个方法，使用一个数组中的数据，方法传递参数
 */
import java.util.Random;
public class CallName_003{
    public static void main(String[] args){
        //1.存储所有学生姓名
        String[] names = new String[4];
        getNames(names);
        //2.预览所有学生姓名
        lookNames(names);
        //3.随机数作为索引,到数组中寻找元素
        String name = indexForNames(names);
        System.out.println(name);
        
    }

    /*
     * 1.定义一个方法
     * 2.返回值为一个数组
     * 3.没有参数传递
     */
    public static String[] getNames(String[] names){
        
        names[0] = "李磊";
        names[1] = "张三";
        names[2] = "李四";
        names[3] = "王五";
        return names;
    }
    /*
     * 定义一个方法
     * 无返回值
     * 传递参数为 数组 names
     */

    public static void lookNames(String[] names){
        for(int i = 0 ; i < names.length ; i++){
            System.out.println(names[i]);
        }
    }

    /*
     * 定义一个方法
     * 返回值为String 
     * 传递参数为 数组 names
     */
    public static String indexForNames(String[] names){
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        String name = names[index];
        return name;
    }

}
