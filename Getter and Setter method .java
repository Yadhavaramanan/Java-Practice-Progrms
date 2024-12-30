import java.util.*;

public class Main{
    public static void main(String[] args){
        Sample s1 = new Sample();
        s1.SwitchOn();
        s1.SwitchOff();
        s1.ChargingLight();
        
        s1.setter(5,230,43,30);
        s1.getter();
    }
}

class Sample{
    
    int led;
    int power;
    int fiber;
    int battry;
    boolean status =false;
    
    public void SwitchOn(){
        System.out.println("Light turned on.");
    }
    
    public void SwitchOff(){
        System.out.println("Light turned off.");
    }
    
    public void ChargingLight(){
        System.out.println("Light Charging Now...");
    }
    
    public void getter(){
        System.out.println("LED:"+ led);
        System.out.println("POWER:"+ power);
        System.out.println("FIBER:"+ fiber);
        System.out.println("BATTRY:"+ battry);
        System.out.println("STATUS:"+ status);
    }
    
    public void setter(int l, int p, int f, int b){
        led = l;
        power= p;
        fiber = f;
        battry = b;
        status = true;
        
    }
}
