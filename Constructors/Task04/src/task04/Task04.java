package task04;

public class Task04 {

    public static void main(String[] args) {
        Class c1 = new Class("Dell corei5",512);
        Class c2 = new Class(c1);    //Copy constructor
        c1.displayInfo();
        c2.displayInfo();
    }
    
}
