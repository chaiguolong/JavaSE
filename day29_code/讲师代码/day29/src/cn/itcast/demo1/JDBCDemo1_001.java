package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * PreparedStatement接口实现数据标的查询操作
 */
public class JDBCDemo1_001{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybase";
        String username = "root";
        String password = "mysql";
        Connection con = DriverManager.getConnection(url,username,password);

        String sql = "SELECT * FROM sort";

        PreparedStatement pst = con.prepareStatement(sql);

        //调用pst对象的方法,执行查询语句,select
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("sid")+"        "+rs.getString("sname")+"        "+
                        rs.getString("sprice")+"        "+rs.getString("sdesc"));
        }

        rs.close();
        pst.close();
        con.close();
    }
}
