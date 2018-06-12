package cn.itcast.demo2;

public class Person_002{
    private String name;
    private int age;

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());

        return result;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null )
            return false;
        if(getClass() != obj.getClass())
            return false;
        
        Person_002 other = (Person_002) obj;
        if(age != other.age)
            return false;
        if(name == null){
            if(other.name != null){
                return false;
            }
        }else if(!name.equals(other.name))
            return false;
        return true;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Person_002(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public Person_002(){
        super();
    }

    public String toString(){
        return "Person_002" + name + "..." + age;
    }
}
