package cn.itcast.demo1;

import java.util.LinkedHashSet;
/*
 * LinkedHashSet 基于链表的哈希表实现
 * 继承自HashSet
 *
 * LinkedHashSet 自身特性，具有顺序，存储和取出的顺序相同的
 * 线程不安全的集合，运行速度快
 */
public class LinkedHashSetDemo_002{
    public static void main(String[] args){
        LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
        link.add(233);
        link.add(33);
        link.add(33);
        link.add(66);
        link.add(11);
        link.add(66);
        System.out.println(link);
    }
}
