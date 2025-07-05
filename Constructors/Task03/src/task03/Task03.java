package task03;

public class Task03 {

    public static void main(String[] args) {
        Class c1 = new Class("Abdullah",19,"B+");
        Class c2 = new Class("Urooba",18);
        System.out.println("Constructor with three parameters:");
        c1.displayInfo();
        System.out.println("Constructor with two paramteres: ");
        c2.displayInfo();
    }
    
}
