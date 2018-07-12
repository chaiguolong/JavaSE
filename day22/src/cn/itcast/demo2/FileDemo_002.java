package cn.itcast.demo2;

import java.io.File;

/*
 * 对一个目录下的所有内容,进行完全遍历
 * 编程技巧,方法的递归调用,自己调用自己
 */
public class FileDemo_002{
    public static void main(String[] args){
        File file = new File("/Users/mymac/Desktop/");
        getAllDir(file);
    }

    /*
     * 定义方法,实现目录的全遍历
     */
    public static void getAllDir(File dir){
        System.out.println(dir);
        //调用方法listFiles()对目录,dir进行遍历
        File[] fileArrs = dir.listFiles();
        for(File fileArr : fileArrs){
            //判断变量fileArr表示的路径是不是文件夹
            if(fileArr.isDirectory()){
                //是一个目录,就要去遍历这个目录
                //本方法,getAllDir,就是给这个目录去遍历
                //继续调用getAllDir(),传递它目录
                getAllDir(fileArr);
            }else{
                System.out.println(fileArr);
            }
        }
    }
}
