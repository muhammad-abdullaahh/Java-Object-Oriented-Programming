package task01;

public class Task01 {

    public static void main(String[] args) {
        Book b1 = new Book("Twisted Love","Collen Hoover",200);
        Library l1 = new Library("Central Library",b1);
        l1.displayInfo();
    }
    
}
