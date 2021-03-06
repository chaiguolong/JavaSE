/*
 * 集合的遍历
 * 实现思想也是索引思想
 * 集合的索引从0开始，到size()-1
 * 方法get(int index)
 */
import java.util.ArrayList;
public class ArrayListDemo_2_001{
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(123);
        array.add(234);
        array.add(453);
        array.add(987);
        array.add(124);

        //对集合进行遍历
        //使用方法size+get组合进行遍历
        for(int i = 0 ; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
