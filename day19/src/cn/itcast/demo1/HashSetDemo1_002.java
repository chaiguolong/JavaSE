package cn.itcast.demo1;

import java.util.HashSet;

import cn.itcast.demo3.Person;

/*
 * HashSet集合的自身特点：
 *      底层数据结构:哈希表
 *      存储和取出都比较快
 *      线程不安全，运行速度快
 */
public class HashSetDemo1_002{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        // set.add(new String("abc"));
        // set.add(new String("abc"));
        // set.add(new String("bbc"));
        // set.add(new String("bbc"));
        // System.out.println(set);
        
        //将Person对象中的姓名，年龄，相同的数据，看做同一个对象
        //判断对象是否重复，依赖对象自己的方法，hashCode，equals
        HashSet<Person> setPerson = new HashSet<Person>();
        setPerson.add(new Person("a",11));
        setPerson.add(new Person("b",12));
        setPerson.add(new Person("b",12));
        setPerson.add(new Person("c",23));
        setPerson.add(new Person("d",19));
        setPerson.add(new Person("e",17));

        System.out.println(setPerson);

    }
}
