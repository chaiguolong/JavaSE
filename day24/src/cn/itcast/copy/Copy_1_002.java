package cn.itcast.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用缓冲区流对象,复制文本文件
 * 数据源 BufferedReader + FileReader 读取
 * 数据目的 BufferedWriter + FileWriter 写入
 * 读取文本行,读一行,写一行,写换行
 */
public class Copy_1_002{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("/Users/mymac/Desktop/src.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/mymac/Desktop/desc.txt"));
        //读取文本行,读一行,写一行
        String line = null;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        bw.close();
    }
}
