import java.util.*;
abstract class paytm{
    public abstract void display();
    public abstract void showbalance();
    public abstract void sendmoney();
    
    public void greet(){
        System.out.println ("Welcome to paytm");
    }
}

class subclass extends paytm{
    public void display(){
        System.out.println("Hello!");
    }
    public void showbalance(){
        System.out.println("Your current Balance is : 20000");
        
    }
    public void sendmoney(){
            System.out.println("1000rs sent!");
        }
        
   

}
public class Main
{
	public static void main(String[] args) {
	   subclass s = new subclass();
	   subclass s1 = new subclass();
	   s.greet();
	   s.display();
	   s.showbalance();
	   s.sendmoney();
	}
}
