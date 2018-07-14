package cn.itcast.demo1;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream读取文件
 *  读取方法 int read(byte[] b) 读取字节数组
 *  数组作用: 缓冲的作用,提高效率
 *  read返回的int,表示什么含义, 读取到多少个有效的字节数
 */
public class FileInputStreamDemo1_002{
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("/Users/mymac/Desktop/chai.txt");
        //创建字节数组
        byte[] bytes = new byte[1024];

        int len = 0;

        while((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        //关闭资源
        fis.close();
    }
}
