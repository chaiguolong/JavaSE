package cn.itcast.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 集合操作的工具类
 * Collections
 */
public class CollectionsDemo_002{
    public static void main(String[] args){
        function();
    }
    /*
     * Collections.shuffle方法
     * 对List集合中的元素,进行随机排列
     */
    public static void function_2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(21);
        list.add(28);
        list.add(22);
        System.out.println(list);

        //调用工具类方法shuffle对集合随机排列
        Collections.shuffle(list);
        System.out.println(list);
    }

    /*
     * Collections.binarySearch静态方法
     * 对List集合进行二分搜索,方法参数,传递List集合,传递被查找的元素
     */
    public static void function_1(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(13);
        list.add(15);
        list.add(19);
        //调用工具类静态方法binarySearch
        int index = Collections.binarySearch(list,11);
        System.out.println(index);
    }

    /*
     * Collections静态方法
     * 对于List集合,静态升序排列
     */
    public static void function(){
        //创建集合
        List<String> list = new ArrayList<String>();
        list.add("sdkjlsd");
        list.add(";sdfsjj");
        list.add("sldkjf");
        list.add("dfhdkjh;lsdjk");
        list.add("s;ljfkf;la");
        System.out.println(list);
        //调用工具类的方法sort
        Collections.sort(list);
        System.out.println(list);
    }


}

