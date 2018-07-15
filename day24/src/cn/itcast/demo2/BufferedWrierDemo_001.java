package cn.itcast.demo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出缓冲区流
 *  java.io.BufferedWriter 继承 Writer
 *  写入方法 write() 单个字符 ,字符数组 ,字符串
 *
 *  构造方法:
 *      BufferedWriter(Writer w) 传递任意字符输出流
 *      传递谁,就高效谁
 *          能传递的字符输出流 FileWriter OutputStreamWriter
 *
 *  BufferedWriter 具有自己特有的方法
 *  void newLine() 写换行
 *
 *      newLine()文本中换行, \n也是文本换行
 *      方法具有平台无关性
 *      Windows \r\n
 *      Linux  \n
 *
 *      newLine()运行结果,和操作系统是相互关系
 *      JVM:安装的是Windows版本,newLine()写的就是\r\n
 *          安装的是Linux版本,newLine()写的就是\n
 */
public class BufferedWrierDemo_001{
    public static void main(String[] args) throws IOException{
        //创建字符输出流,封装文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mymac/Desktop/input.txt"));
        //写入文件
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
