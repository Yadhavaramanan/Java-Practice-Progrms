import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car color: ");
        String color = sc.nextLine();
        System.out.print("Enter max speed: ");
        int maxSpeed = sc.nextInt();
        System.out.print("Enter acceleration: ");
        int acceleration = sc.nextInt();
        System.out.print("Enter type friction: ");
        int typeFrict = sc.nextInt();

        Car car = new Car(color, maxSpeed, acceleration, typeFrict);

        System.out.println("Colour: " + car.getColor());
        System.out.println("MaxSpeed: " + car.getMaxSpeed());
        System.out.println("Acceleration: " + car.getAcceleration());
        System.out.println("TypeFriction: " + car.getTypeFrict());
        System.out.println("Engine Start Status: " + car.isEngineStart());

        car.startEngine();
        car.stopEngine();

        sc.close();
    }
}

class Car {
    private String color;
    private int maxSpeed;
    private int acceleration;
    private int typeFrict;
    private boolean isEngineStart = false;

    public Car(String color, int maxSpeed, int acceleration, int typeFrict) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.typeFrict = typeFrict;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getTypeFrict() {
        return typeFrict;
    }

    public boolean isEngineStart() {
        return isEngineStart;
    }

    public void startEngine() {
        isEngineStart = true;
        System.out.println("Engine Started...");
    }

    public void stopEngine() {
        isEngineStart = false;
        System.out.println("Engine Stopped...");
    }
}
