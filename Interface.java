import java.util.*;

interface Calculator{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}

class calculate implements Calculator{
    int a,b;
    
    public void add(int a,int b){
        System.out.println("Addition of two numbera:"+ (a+b));
    }
    public void sub(int a,int b){
        System.out.println("Subtraction of two numbera:"+ (a-b));
    }
    public void mul(int a,int b){
        System.out.println("Multiply of two numbera:"+ (a*b));
    }
    public void div(int a,int b){
        System.out.println("Division of two numbera:"+ (a/b));
    }
}

public class Main{

public static void main (String[] args) {
    /* code */
    System.out.println("Calculator perform an arithmatic operations....");
    calculate c = new calculate();
    c.add(5,2);
    c.sub(10,5);
    c.mul(9,4);
    c.div(6,2);
}
}
