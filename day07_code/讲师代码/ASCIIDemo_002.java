/*
 * ASCII编码表演示
 * 字符Java 数据类型，char
 * 整数Java 数据类型，int
 *
 * int类型和char类型    数据累心转换
 * char 两个字节，int 四个字节
 *
 * char转成int类型的时候，类型自动提示，char数据类型，会查询编码表，得到整数
 * int转成char类型的时候，强制转换，会查询编码表
 *
 * char存储汉子，查询Unicode编码表
 *
 * char可以和int计算，提示为int类型，内存中连个字节
 * char取值范围是0-65535，无符号的数据类型
 */
public class ASCIIDemo_002{
    public static void main(String[] args){
        char c = 'a';
        int i = c + 1;
        System.out.println(i);

        int j = 90;
        char h = (char) j;
        System.out.println(h);

        System.out.println((char)6);

        char k = '你';
        System.out.println(k);
    }
}
