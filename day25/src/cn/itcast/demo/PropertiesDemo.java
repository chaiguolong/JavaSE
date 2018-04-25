package cn.itcast.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args)throws IOException {
		function_2();
	}
	public static void function_2()throws IOException{
		Properties pro = new Properties();
		pro.setProperty("name", "zhangsan");
		pro.setProperty("age", "31");
		pro.setProperty("email", "123456789@163.com");
		FileWriter fw = new FileWriter("c:\\pro.properties");
		pro.store(fw, "");
		fw.close();
	}
	
	public static void function_1()throws IOException{
		Properties pro = new Properties();
		FileReader fr = new FileReader("c:\\pro.properties");
		pro.load(fr);
		fr.close();
		System.out.println(pro);
	}
	
	public static void function(){
		Properties pro = new Properties();
		pro.setProperty("a", "1");
		pro.setProperty("b", "2");
		pro.setProperty("c", "3");
		System.out.println(pro);
		
		String value = pro.getProperty("c");
		System.out.println(value);
		
		Set<String> set = pro.stringPropertyNames();
		for(String key : set){
			System.out.println(key+"..."+pro.getProperty(key));
		}
	}
}
