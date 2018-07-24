package cn.itcast.demo2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import cn.itcast.domain.Sort;
import cn.itcast.jdbcutil.JDBCUtilsConfig;

/*
 *  QueryRunner数据查询操作:
 *    调用QueryRunner类方法query(Connection 从,String sql,ResultSetHandler r,Object...params)
 *    ResultSetHandler r 结果集的处理方式,传递ResultSetHandler接口实现类
 *    Object...params SQL语句中的?占位符
 *
 *    注意:query方法返回值,返回的是T 泛型,具体返回值类型,跟随结果集处理方式变化
 */
public class QueryRunnerDemo1_002{
    private static Connection con = JDBCUtilsConfig.getConnection();
    public static void main(String[] args) throws SQLException{
        arrayHandler();
    }

    /*
     * 结果集第一种处理方法,ArrayHandler
     * 将结果集的第一行存储到对象数组中 Object[]
     */
    public static void arrayHandler() throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用方法query执行查询,传递连接对象,SQL语句,结果集处理方式的实现类
        //返回对象数组
        Object[] result = qr.query(con,sql,new ArrayHandler());
        for(Object obj : result){
            System.out.print(obj);
        }
    }
}
