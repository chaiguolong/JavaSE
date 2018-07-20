package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Java程序实现用户登录,用户名和密码,数据库检查
 */
public class JDBCDemo2_001{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybase";
        String username = "root";
        String password = "mysql";
        Connection conn = DriverManager.getConnection(url,username,password);
        Statement stat = conn.createStatement();

        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();

        //执行SQL语句,数据表,查询用户名和密码,如果存在,登录成功,不存在登录失败
        String sql = "SELECT * FROM users WHERE username ='"+user+"' AND PASSWORD='"+pass+"'";
        System.out.println(sql);
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("username")+"   "+rs.getString("password"));
        }

        rs.close();
        stat.close();
        conn.close();
    }
}
