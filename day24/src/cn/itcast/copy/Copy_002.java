package cn.itcast.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 文件复制方式,字节流,一个4个方式
 * 1.字节流读写单个字节 
 * 2.字节流读写字节数组
 * 3.字节流缓冲区流读写单个字节
 * 4.字节流缓冲区流读写字节数组
 */
public class Copy_002{
    public static void main(String[] args) throws IOException{
        long s = System.currentTimeMillis();
        copy_2(new File("/Users/mymac/Desktop/src.txt"),new File("/Users/mymac/Desktop/desc"));
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

    /*
     * 方法,实现文件复制
     * 3.字节流缓冲去流读写单个字节
     */
    public static void copy_3(File src,File desc) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));

        int len = 0;

        while((len = bis.read()) != -1){
            bos.write(len);
        }

        bis.close();
        bos.close();
    }

    /*
     * 方法,实现文件复制
     * 2.字节流读写字符数组
     */
    public static void copy_2(File src,File desc) throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);

        byte[] b = new byte[1024];
        int len = 0;
        while((len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }

        fos.close();
        fis.close();
    }


    /*
     * 方法,实现文件复制
     * 1.字节流读写单个字节
     */
    public static void copy_1(File src,File desc) throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);

        int len = 0;
        while((len = fis.read()) != -1){
            fos.write(len);
        }

        fis.close();
        fos.close();
    }
}
