/*Arguement passing is of 2 types 1. CALL BY VALUE 2.CALL BY REFERNCE(using objects)*/
import java.util.*;

public class CallbyValue{
    void fun(int a, int b){
        a = a + 5;
        b = b + 5;
    }
    //void fun1(CallbyValue obj1){
        
        //a = obj1.a + 5;
        //b = obj1.b + 5;
    //}
    static public void main(String[] args){
        int a = 10;
        int b = 20;
        
        System.out.println("Values before function: " + a + "\t" + b);
        
        CallbyValue obj1 = new CallbyValue();
        obj1.fun(a,b);
        System.out.println("Values after function: " + a + "\t" + b);
        
        // CallbyValue obj2 = new CallbyValue();
        // obj2.fun1(obj1);
        // System.out.println("Values after function1: " + a + "\t" + b);
        
    }
}
