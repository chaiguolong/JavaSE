/*
 * 测试手机类
 * 创建2个手机类的变量
 */
public class TestPhone_1_001{
    public static void main(String[] args){
        //创建手机类型变量
        Phone_001 p1 = new Phone_001();

        //再次创建手机类型变量
        Phone_001 p2 = new Phone_001();

        p1.color = "白色";
        p1.brand = "锤子";
        p1.size = 4.5;

        p2.brand = "华为";
        System.out.println(p1.brand);
        System.out.println(p2.brand);
        System.out.println(p2.size);
    }
}
