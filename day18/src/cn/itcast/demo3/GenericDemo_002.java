package cn.itcast.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * JDK1.5出现新的安全机制，保证程序的安全性
 * 泛型：指明了集合中存储数据的类型<数据类型>
 */
public class GenericDemo_002{
    public static void main(String[] args){
        function();
    }

    public static void function(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("skdjflsdjk");
        coll.add("sdkj");

        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s.length());
        }
    }
}
