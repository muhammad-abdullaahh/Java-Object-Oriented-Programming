package task04;

public class Engine {
    private String engineType;
    private int horsepower,torque;
    public Engine(String engineType,int horsepower,int torque){
        this.engineType=engineType;
        this.horsepower=horsepower;
        this.torque=torque;
    }
    public void displayInfo(){
        System.out.println("The engine type is"+engineType+" which can produce "+horsepower+" horsepower and "+torque+" nm of torque");
    }
}
