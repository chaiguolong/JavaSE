package cn.itcast.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 实现TCP服务器程序
 * 表示服务器程序的类 java.net.ServerSocket
 * 构造方法:
 *  ServerSocket(int port) 传递端口号
 *
 * 很重要的是:必须要获得客户端的套接字对象Socket
 * Socket accept();
 */
public class TCPServer_002{
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(8888);
        //通过服务器套接字对象的方法accept() 获取客户端套接字对象
        Socket socket = server.accept();
        //通过客户端套接字对象,socket获取自己输入流,读取的是客户端发送来的数据
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data,0,len));

        //服务器向客户端传回数据,字节输出流,通过客户端套接字对象获取字节输出流
        OutputStream out = socket.getOutputStream();
        out.write("收到,谢谢".getBytes());

        socket.close();
        server.close();

    }
}
