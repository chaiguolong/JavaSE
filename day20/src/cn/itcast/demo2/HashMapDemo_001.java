package cn.itcast.demo2;

import java.util.HashMap;
import java.util.Map;

/*
 * 使用HashMap集合,存储自定义的对象
 * 自定义对象,作为键,出现,作为值出现
 */
public class HashMapDemo_001{
    public static void main(String[] args){
        function_1();
    }

    /*
     * HashMap存储自定义对象Person,作为键出现
     * 键的对象,是Person类型,值是字符串
     * 保证键的唯一性,存储到键的对象,重写hashCode equals
     */
    public static void function_1(){
        HashMap<Person,String> map = new HashMap<Person,String>();
        map.put(new Person("a",20),"里约热内卢");
        map.put(new Person("b",18),"索马里");
        map.put(new Person("c",17),"索马里");
        map.put(new Person("b",18),"百慕大");
        for(Person key : map.keySet()){
            String value = map.get(key);
            System.out.println(key + "..." + value);
        }
    }
}
