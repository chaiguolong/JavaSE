package cn.itcast.demo6;

import java.util.concurrent.Callable;

public class GetSumCallable_002 implements Callable<Integer>{
    private int a;
    public GetSumCallable_002(int a){
        this.a =a;
    }

    public Integer call(){
        int sum = 0;
        for(int i = 0 ; i <= a; i++){
            sum = sum + i;
        }
        return sum;
    }
}
