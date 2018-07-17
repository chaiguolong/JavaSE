package cn.itcast.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo_001{
    public static void main(String[] args) throws IOException{
        function_2();
    }

    public static void function_2() throws IOException{
        Properties pro = new Properties();
        pro.setProperty("name","李四");
        pro.setProperty("age","40");
        pro.setProperty("email","123456@sina.com");
        FileWriter fw = new FileWriter("/Users/mymac/Desktop/pro1.Properties");
        pro.store(fw,"李四的个人信息");
        fw.close();
    }

    public static void function_1() throws IOException{
        Properties pro = new Properties();
        FileReader fr = new FileReader("/Users/mymac/Desktop/pro.Properties");
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }

    public static void function(){
        Properties pro = new Properties();
        pro.setProperty("a","1");
        pro.setProperty("b","2");
        pro.setProperty("c","3");
        System.out.println(pro);

        String value = pro.getProperty("c");
        System.out.println(value);

        Set<String> set = pro.stringPropertyNames();
        for(String key : set){
            System.out.println(key+"..."+pro.getProperty(key));
        }
    }
}
