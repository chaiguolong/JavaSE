package cn.itcast.demo1;

import java.io.File;
import java.io.FileFilter;

/*
 * 自定义过滤器
 * 实现FileFilter接口,重写抽象方法
 */
public class MyFilter_001 implements FileFilter{
    public boolean accept(File pathname){
        /*
         * pathname 接受到的也是文件的全路径
         * /Users/mymac/Desktop/
         * 对路径进行判断,如果是java文件,返回true,不是java文件,返回false
         * 文件的后缀结尾是.java
         */
        return pathname.getName().endsWith(".txt");
        
    }
}
