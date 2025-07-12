package task04;

public class Car {
    private String model,color;
    private Engine engine;
    public Car(String model,String color){
        this.model=model;
        this.color=color;
        engine = new Engine("V8",550,625);
    }
    public void displayInfo(){
        System.out.println("The model of the car is "+model+" and its color is "+color);
        System.out.println("Its engine details are :");
        engine.displayInfo();
    }
}
