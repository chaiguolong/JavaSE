package test.billy.jee.noide.testtest;
import com.billy.jee.noide.bean.*;

public class NoIDETest{

    public static void main(String[] args){
        System.out.println("Hello, javac!");

        User user = new User();
        user.id = 1;
        user.name = "Billy";

        System.out.println(user); 
    }

}
