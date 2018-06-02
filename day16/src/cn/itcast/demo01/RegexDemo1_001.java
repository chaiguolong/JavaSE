package cn.itcast.demo01;

public class RegexDemo1_001{
    public static void main(String[] args){
        split_1();
    }
    /*
     * String类方法split对字符串进行切割
     * 12-25-36-98 按照-对字符串进行切割
     */
    public static void split_1(){
        String str = "12-23-34-45";
        //按照-对字符串进行切割，String类方法split
        String[] strArr = str.split("-");
        System.out.println("数组的唱的"+strArr.length);
        for(int i = 0 ; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }

    /*
     * String类方法split对字符串进行切割
     * 18 22 40 65按照空格进行切割字符串
     */
    public static void split_2(){
        String str = "18      22          40          65";
        String[] strArr = str.split(" +");
        System.out.println("数组的长度"+strArr.length);
        for(int i= 0 ; i < strArr.length ; i++){
            System.out.println(strArr[i]);
        }
    }

    /*
     * "Hello123World897899998"将所有数字替换掉
     * String类方法replaceAll(正则规则，替换后新的字符串)
     */
    public static void replaceAll_1(){
        String str = "Hello123World897899998";
        str = str.replaceAll("[\\d]+","#");
        System.out.println(str);
    }

    /*
     * String类方法split对字符串进行切割
     * 192.168.105.27按照点切割字符串
     */
    public static void split_3(){
        String ip = "192.168.105.27";
        String[] strArr = ip.split("\\.");
        System.out.println("数组的长度"+ strArr.length);
        for(int i = 0 ;i < strArr.length ; i++){
            System.out.println(strArr[i]);
        }
    }
}
