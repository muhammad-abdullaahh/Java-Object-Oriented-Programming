package task02;

public class Task02 {

    public static void main(String[] args) {
        Car c1 = new Car("BMW M5 F90 Competition",2024);
        Car c2 = new Car("Mercedes AMG C63S",2023);
        System.out.println("Displaying the detials of car 1:");
        c1.displayInfo();
        System.out.println("Displaying the detials of car 2:");
        c2.displayInfo();
    }
    
}
