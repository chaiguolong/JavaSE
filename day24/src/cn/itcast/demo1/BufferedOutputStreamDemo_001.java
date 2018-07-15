package cn.itcast.demo1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流的缓冲流
 * java.io.BufferedOutputStream 作用:提高原油输出流的写入效率
 * BufferedOutputStream 继承 OutputStream 
 * 方法,写入 write 字节,字节数组
 *
 * 构造方法:
 *  BufferedOutputStream(OutputStream out)
 *  可以传递任意的字节输出流,传递的是哪个字节流,就对哪个字节流提高效率
 *
 *  FileOutputStream
 */
public class BufferedOutputStreamDemo_001{
    public static void main(String[] args) throws IOException{
        //创建字节输出流,绑定文件
        BufferedOutputStream bos = new 
            BufferedOutputStream(new FileOutputStream("/Users/mymac/Desktop/input.txt"));

        bos.write(55);

        byte[] bytes = "HelloWorld".getBytes();

        bos.write(bytes);

        bos.write(bytes,3,2);

        bos.close();
    }
}
