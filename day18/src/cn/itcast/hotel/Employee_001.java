package cn.itcast.hotel;
/*
 * 酒店的员工类
 *  员工共性，姓名，工号，工作方法
 */
public abstract class Employee_001{
    private String name;
    private String id;

    public Employee_001(){}

    public Employee_001(String name,String id){
        this.name = name;
        this.id = id;
    }

    public abstract void work();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
