package task05;

public class Task05 {

    public static void main(String[] args) {
        Father obj = new Son();     //Passing child class object in parent reference
        obj.display();              // Here the method is called with respect to the reference ( Dynamic binding)
    }
    
}
