/*
 * 定义的测试类
 * 同事测试，电饭锅，汽车，学生
 */
public class Test_001{
    public static void main(String[] args){
        //创建电饭锅引用类型
        DianFanGuo_001 dfg = new DianFanGuo_001();

        dfg.brand = "特斯拉";
        dfg.color = "红色";
        dfg.size = 30;

        System.out.println(dfg.brand + "    " + dfg.color+ "    "+ dfg.size);

        //创建汽车引用类型
        Car_001 c = new Car_001();
        c.brand = "巨力";
        c.type = "拖拉机";
        c.paiLiang = 0.5;

        System.out.println(c.brand + "      " + c.type+"    "+ c.paiLiang);

        //创建学生引用类型
        Student_001 stu = new Student_001();
        stu.name = "张三";
        stu.age = 20;
        stu.sex = '男';
        System.out.println(stu.name+"   "+stu.age+"     "+stu.sex);
        
    }
}
