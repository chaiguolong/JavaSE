package cn.itcast.demo2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符输入流缓冲流
 *  java.io.BufferedReader 继承Reader
 *  读取功能 read() 单个字符 ,字符数组
 *  构造方法:
 *      BufferedReader(Reader r)
 *      可以任意的字符输入流
 *          FileReader InputStreamReader
 *
 *  BufferedReader 自己的功能
 *  String readLine() 读取文本行 \n
 *
 *  方法读取到流末尾,返回null
 *  小特点:
 *      获取内容的方法一般都有返回值
 *      int 没有返回的都是负数
 *      引用类型 找不到返回null
 *      boolean 找不到返回false
 *
 *      String s = null;
 *      String s = "null"
 *
 *      readLine() 方法返回行的有效字符,没有\n
 */
public class BufferedReaderDemo_001{
    public static void main(String[] args) throws IOException{
        int lineNumber = 0;
        //创建字符输入缓冲流对象,构造方法传递字符输入流,包装数据源文件
        BufferedReader br = new BufferedReader(new FileReader("/Users/mymac/Desktop/input.txt"));
        //调用缓冲流的方法 readLine()读取文本行
        //循环读取文本行,结束条件 readLine() 返回null
        String line = null;
        while((line = br.readLine()) != null){
            lineNumber++;
            System.out.println(lineNumber+"     "+line);
        }

        br.close();
    }
}