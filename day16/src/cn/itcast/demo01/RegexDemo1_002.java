package cn.itcast.demo01;

public class RegexDemo1_002{
    public static void main(String[] args){
        // replaceAll_1();
        split_1();
    }

    /*
     * String类方法split对字符串进行切割
     * 12-34-45-68按照-对字符串进行切割
     */
    public static void split_1(){
        String str = "12-34-56-77";
        String[] strArr = str.split("-");
        System.out.println("数组长度"+strArr.length);
        for(int i = 0 ; i < strArr.length ; i++){
            System.out.println(strArr[i]);
        }
    }

    /*
     * String类方法split对字符串进行切割
     * 18 22 45 99按照空格对字符串进行切割
     */
    public static void split_2(){
        String str = "18         22 44      99";
        String[] strArr = str.split(" +");
        System.out.println("数组的长度"+strArr.length);
        for(int i = 0 ; i < strArr.length ; i++){
            System.out.println(strArr[i]);
        }
    }

    /*
     * String类方法split对字符串进行切割
     * 192.168.99.88按照点进行切割
     */
    public static void split_3(){
        String str = "192.168.99.88";
        String[] strArr = str.split("\\.");
        System.out.println("数组的长度"+strArr.length);
        for(int i = 0 ; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }

    }

    /*
     * "Hello343241*world334"将所有字符串数字替换掉
     * String类方法replaceAll（正则规则，替换后的新字符串)
     */
    public static void replaceAll_1(){
        String str ="Hello343241*world334";
        str = str.replaceAll("[\\d]+","#");
        System.out.println(str);
    }
}
