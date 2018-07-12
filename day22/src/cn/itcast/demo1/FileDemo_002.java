package cn.itcast.demo1;

import java.io.File;

/*
 * File类获取功能
 * list
 * listFiles
 */
public class FileDemo_002{
    public static void main(String[] args){
        function_2();
    }

    public static void function_2(){
        //获取系统中的所有根目录
        File[] fileArrs = File.listRoots();
        for(File fileArr : fileArrs){
            System.out.println(fileArr);
        }
    }





    /*
     * File类的获取功能
     * File[] listFiles()
     * 获取到,File构造方法中封装的路径中的文件和文件夹名(遍历一个目录)
     * 返回的是目录或者文件的全路径
     */
    public static void function_1(){
        File file = new File("/Users/mymac/Desktop/");
        File[] fileArrs = file.listFiles();
        for(File fileArr : fileArrs){
            System.out.println(fileArr);
        }
    }

    /*
     * File类的获取功能
     * String[] list()
     * 获取到,File构造方法中封装的路径中的文件和文件夹名(遍历一个目录)
     * 返回只有名字
     */
    public static void function(){
        File file = new File("/Users/mymac/Desktop/");
        String[] names = file.list();
        for(String name : names){
            System.out.println(name);
        }
    }
}
