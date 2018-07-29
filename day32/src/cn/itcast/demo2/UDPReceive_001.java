package cn.itcast.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 实现UDP接受端
 * 永不停歇的接受端
 */
public class UDPReceive_001{
    public static void main(String[] args) throws IOException{
        //创建数据包传输对象DatagramSocket 绑定端口号
        DatagramSocket ds = new DatagramSocket(6000);
        //创建字节数组
        byte[] data = new byte[1024];
        while(true){
            DatagramPacket dp = new DatagramPacket(data,data.length);
            //调用ds对象方法receive传递数据包
            ds.receive(dp);

            //获取发送端的IP地址对象
            String ip = dp.getAddress().getHostAddress();

            //获取发送的端口号
            int port = dp.getPort();

            //获取街搜到的字节个数
            int length = dp.getLength();

            System.out.println(new String(data,0,length)+"..."+ip+":"+port);
        }

    }
}
