package cn.itcast.demo01;

public class RegexDemo2_001{
    public static void main(String[] args){
        checkMail();
    }

    /*
     * 检查右键地址是否合法
     * 规则：
     *  1234567@qq.com
     *  mym——ail@sina.com
     *
     *
     *  @：前   数字字母_   个数不能小于一个
     *  @：后   数字字母    个数不能少于一个
     *  .:  后面    字母
     */
    public static void checkMail(){
        String email = "abc123@sina.com";
        boolean b = email.matches("[a-zA-z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b);
            
    }
}
