package task02;

public class Car {
    String model;
    int year;
    public Car(String model,int year){
        this.model=model;
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("The model of the car is "+model);
        System.out.println("The year of manufacture is "+year);
    }
}
