package task02;

public class Task02 {

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.vehicleType();
        v1.startEngine();
        v1.changeGear();
        Vehicle v2 = new Motorbike();
        v2.vehicleType();
        v2.startEngine();
        v2.changeGear();        
    }
    
}
