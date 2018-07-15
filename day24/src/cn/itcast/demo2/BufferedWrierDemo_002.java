package cn.itcast.demo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流缓冲流
 *  java.io.BufferedWriter 继承 Writer
 *  写入方法 write() 单个字符,字符数组,字符串
 *
 *  构造方法:
 *      BufferedWriter(Writer w) 传递任意字符输出流
 *      传递谁,就高效谁
 *      能传递字符输出流: FileWriter OutputStreamWriter;
 *
 *      BufferedWriter 具有自己特有的方法
 *      void newLine() 写换行
 *
 *      newLine() 文本中换行, \n也是文本换行
 *      方法具有平台无关性
 *      Windows     \r\n
 *      Linux       \n
 *
 *      newLine()运行结果,和操作系统是相互关系
 *      JVM:    安装的是Windows版本,newLine()写的就是\r\n
 *              安装的是linux版本,newLine()写的就是\n
 *
 */
public class BufferedWrierDemo_002{
    public static void main(String[] args) throws IOException{
        //创建字符输出流缓冲流,构造函数传递字符输出流,包装目的文件名
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mymac/Desktop/input.txt"));
        //写数据
        
        bw.write(65);
        
        char[] ch = {'a','b','c','d'};

        bw.write(ch);

        bw.write(ch,1,3);

        
        bw.write("你好");
        bw.newLine();
        bw.flush();

        bw.write("我好");
        bw.newLine();
        bw.flush();

        bw.write("大家好");
        bw.newLine();
        bw.flush();

        bw.close();
    }
}
