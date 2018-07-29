package cn.itcast.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *  实现UDP协议的发送端
 *      实现封装数据的类 java.net.DatagramPacket 将你的数据包装
 *      实现数据传输的类 java.net.DatagramSocket 将数据包发出去
 *
 *  实现步骤:
 *      1.创建DatagramPacket对象,封装数据,接收的地址和端口
 *      2.创建DatagramSocket
 *      3.调用DatagramSocket类方法send,发送数据包
 *      4.关闭资源
 *  
 *      DatagramPacket构造方法:
 *          DatagramPacket(byte[] buf, int length, InetAddress address, int port)
 *
 *          DatagramSocket构造方法
 *              DatagramSocket()空参数
 *              方法:send(DatagramPacket d)
 */
public class UDPSend_002{
    public static void main(String[] args) throws IOException{
        //创建DatagramPacket对象,包装数据,封装接收地址和端口
        //创建字节数组
        byte[] data = "你好UDP".getBytes();
        //创建InetAddress对象,封装自己的IP地址
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(data,data.length,inet,6000);
        //创建DatagramSocket对象,调用对象方法,发送数据
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);

        //关闭资源
        ds.close();
    }
}
