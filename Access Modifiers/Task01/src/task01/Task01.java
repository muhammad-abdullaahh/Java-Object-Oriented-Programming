package task01;

public class Task01 {

    public static void main(String[] args) {
         AccesModifiers obj = new AccesModifiers();
         obj.showAll();
        System.out.println("Accessing from Another class:");
        System.out.println(obj.publicVar);     // Accessible
        // System.out.println(obj.privateVar); // Not Accessible (Compile Error)
        System.out.println(obj.protectedVar);  // Accessible (same package)
        System.out.println(obj.defaultVar);    // Accessible (same package)
    }
    
}
