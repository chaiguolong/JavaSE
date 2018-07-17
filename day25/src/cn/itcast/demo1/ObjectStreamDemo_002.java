package cn.itcast.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/*
 * IO流对象,实现对象的序列化和反序列化
 * ObjectOutputStream 写对象,实现序列化对象
 * ObjectInputStream 读取对象,实现反序列化
 */
public class ObjectStreamDemo_002{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        // writeObject();
        readObject();
    }

    /*
     * ObjectInputStream
     * 构造方法:ObjectInputStream(InputStream in)
     * 传递任意的字节输入流,输入流封装文件,必须是序列化的文件
     * Object readObject() 读取对象
     */
    public static void readObject() throws IOException,ClassNotFoundException{
        //创建自己输入流,封装已经序列化的文件
        FileInputStream fis = new FileInputStream("/Users/mymac/Desktop/Person2.txt");
        //创建读取对象的序列化流的对象,构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        //调用对象输入流方法readObject() 读取对象
        Object obj = ois.readObject();
        System.out.println(obj);

        ois.close();

    }

    /*
     * ObjectOutputStream
     * 构造方法:ObjectOutputStream(OutputStream out)
     * 传递任意的字节输出流
     * void writeObject(Object obj)写出对象的方法
     */
    public static void writeObject() throws IOException{
        //创建字节输出流,封装文件
        FileOutputStream fos = new FileOutputStream("/Users/mymac/Desktop/Person2.txt");
        //创建写出对象的序列化流的对象,构造方法传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person p = new Person("lisi",25);
        //调用序列化流的方法writeObject,写出对象
        oos.writeObject(p);
        oos.close();
    }
}
