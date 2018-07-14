package cn.itcast.demo2;

import java.io.FileReader;
import java.io.IOException;

/*
 * 字符输入流读取文本文件,所有字符输入流的超类
 *  java.io.Reader
 *  专门读取文本文件
 *
 *  读取方法:read()
 *  int read() 读取一个字符
 *  int read(char[] c) 读取字符数组
 *
 *  Reader类是抽象类,找到子类对象 FileReader
 *
 *  构造方法: 绑定数据源
 *
 *  构造方法: 绑定数据源
 *      参数:
 *          File    类型对象
 *          String  文件名
 *
 */
public class ReaderDemo_002{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("/Users/mymac/Desktop/chai.txt");
        // int len = 0;
        // while((len = fr.read()) != -1){
        //     System.out.println(len);
        // }
        
        char[] ch = new char[1024];

        int len = 0;

        while((len = fr.read(ch)) != -1){
            System.out.println(new String(ch,0,len));
        }


        fr.close();
    }
}
