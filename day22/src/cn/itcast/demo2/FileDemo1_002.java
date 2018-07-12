package cn.itcast.demo2;

import java.io.File;
/*
 * 遍历目录,获取目录下的所有.java文件
 * 遍历多级目录,方法递归实现
 * 遍历的过程中,使用过滤器
 */
public class FileDemo1_002{
    public static void main(String[] args){
        File file = new File("/Users/mymac/Desktop/");
        getAllJava(file);
    }

    /*
     * 定义方法,实现遍历指定目录
     * 获取目录中所有.java文件
     */
    public static void getAllJava(File file){
        //调用File对象listFiles()获取,加入过滤器
        File[] fileArr = file.listFiles(new MyJavaFilter_002());
        for(File file1 : fileArr){
            //判断file路径,是不是文件夹
            if(file1.isDirectory()){
                //递归进行遍历
                getAllJava(file1);
            }else{
                System.out.println(file1);
            }
        }
    }
}
