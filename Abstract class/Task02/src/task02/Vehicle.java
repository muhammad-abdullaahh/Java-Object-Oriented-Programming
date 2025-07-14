package task02;

public abstract class Vehicle {
//    Abstract class can have both abstract and concrete methods
    protected void startEngine(){
        System.out.println("Engine is starting");
    }
    protected void changeGear(){
        System.out.println("Change gear");
    }
    protected abstract void vehicleType();
}
