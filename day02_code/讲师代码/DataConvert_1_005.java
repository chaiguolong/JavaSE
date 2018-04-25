/*
 * 数据类型的强制转换
 * 强制：数据类型取值范围大的，转成取值范围小的
 *
 * 数据类型的强制转化，公式
 *  被转后的数据类型    变量名  =   （被转换后的数据类型）要被转的数据
 *
 *  强制类型转换，没有要求的时候，不做
 */
public class DataConvert_1_005{
    public static void main(String[] args){
        //double浮点，转成整数int
        double d = 3.14;
        // int i = d;
        // System.out.println(i);
        
        //被转后的数据类型 变量名 = （被转后的数据类型）要被转的将数据
        int i = (int)d;
        System.out.println(i);

        byte b = (byte)210;
        System.out.println(b);
    }
}
