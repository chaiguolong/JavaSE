package cn.itcast.demo2;

import java.util.LinkedHashMap;

/*
 * LinkedHashMap继承HashMap
 * 保证迭代顺序
 */
public class LinkedHashMapDemo_002{
    public static void main(String[] args){
        LinkedHashMap<String,String> link = new LinkedHashMap<String,String>();
        link.put("1","a");
        link.put("2","a");
        link.put("3","a");
        link.put("4","a");
        System.out.println(link);
    }
}
