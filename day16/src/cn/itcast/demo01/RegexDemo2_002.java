package cn.itcast.demo01;

public class RegexDemo2_002{
    public static void main(String[] args){
        checkMail();
    }

    /*
     * 检查邮件地址是否合法
     * 规则：
     *      12345678@qq.com
     *      mym_ail@sina.com
     *      nimail@167.com.cn
     */
    public static void checkMail(){
        String email = "abc123@sina.com";
        boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b);
    }
}
