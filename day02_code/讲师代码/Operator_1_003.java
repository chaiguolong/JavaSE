/*
 * ++ 写在变量的前面，和写在变量的后面，区别
 * a = 1
 * a++
 * ++a
 * 符号写在前面，还是后面，在变量自己独立计算的时候,没有区别
 *
 * 但是变量，钥匙参与了其他运算，有区别了
 *
 * j=i++ ++后算，先将i的值，赋值给j,i自己再++
 * n=++m ++先算，变量m++ 6 变量赋值给n
 */
public class Operator_1_003{
    public static void main(String[] args){
        int i = 5;
        int j = i++;
        System.out.println(i);
        System.out.println(j);

        int m = 5;
        int n = ++m;
        System.out.println(m);
        System.out.println(n);
    }
}
