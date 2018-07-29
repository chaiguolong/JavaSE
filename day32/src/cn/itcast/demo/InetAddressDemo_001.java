package cn.itcast.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 表示互联网中的IP地址
 *   java.net.InetAddress
 *   静态方法
 *      static InetAddress getLocalHost() LocalHost本地主机
 *      返回本地主机,返回InetAddress对象
 *
 *      static InetAddress getByName(String hostName)传递主机名,获取IP地址对象
 *
 *  非静态方法
 *      String getHostAddress()获取主机IP地址
 *      String getHostName()获取主机名
 */
public class InetAddressDemo_001{
    public static void main(String[] args) throws UnknownHostException{
        // function();
        function_1();
    }

    /*
     * static InetAddress getByName(String hostName)传递主机名,获取IP地址对象
     */
    public static void function_1() throws UnknownHostException{
        InetAddress inet = InetAddress.getByName("www.baidu.com");
        System.out.println(inet);
    }

    /*
     * static InetAddress getLocalHost() LocalHost本地主机
     */
    public static void function() throws UnknownHostException{
        InetAddress inet = InetAddress.getLocalHost();
        //输出结果及时主机名,和 IP地址
        System.out.println(inet.toString());

        String ip = inet.getHostAddress();
        String name = inet.getHostName();
        System.out.println(ip+" "+name);
    }
}

