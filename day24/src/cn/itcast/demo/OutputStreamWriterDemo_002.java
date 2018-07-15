package cn.itcast.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 转换流
 *  java.io.OutputStreamWriter 继承Writer类
 *  就是一个字符输出流,写文本文件
 *  write()字符,字符数组,字符串
 *
 *  字符通向字节的桥梁,将符流转换我字节流
 *
 *  OutputStreamWriter 使用方式
 *  构造方法:
 *      OutputStreamWriter(FileOutputStream out) 接受所有字节输出流
 *      但是:   字节输出流  FileOutputStream
 *
 *  OutputStreamWriter(OutputStream,String charsetName)
 *  String charsetName  传递编码表名字  GBK     UTF-8
 *
 *  OutputStreamWriter 有个子类,    FileWriter
 */
public class OutputStreamWriterDemo_002{
    public static void main(String[] args) throws IOException{
        // writeGBK();
        writeUTF();
    }

    /*
     * 转换流对象OutputStreamWriter写文本
     * 采用UTF-8编码表写入
     */
    public static void writeUTF() throws IOException{
        //创建字节输出流,绑定数据文件
        FileOutputStream fos = new FileOutputStream("/Users/mymac/Desktop/input.txt");
        //创建转换流对象,构造方法保证字节流输出,并指定编码表UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        //写文件
        osw.write("你好");

        osw.close();
    }

    /*
     * 转换流对象 OutputStreamWriter 写文本
     * 文本采用GBK的形式写入
     */
    public static void writeGBK() throws IOException{
        //创建字节输出流,绑定数据文件
        FileOutputStream fos = new FileOutputStream("/Users/mymac/Desktop/input.txt");
        //创建转换流,构造方法,绑定字节输出流,使用GBK编码表
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //转换流编写数据
        
        osw.write("你好");

        osw.close();
    }
}
