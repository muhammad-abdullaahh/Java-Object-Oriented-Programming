package task01;

public class Task01 {

    public static void main(String[] args) {
        Book b1 = new Book("Twisted love","Collen Hoover",200);
        Book b2 = new Book("Twisted hate","Collen Hoover",200);
        System.out.println("Book 1 details:");
        b1.displayInfo();
        System.out.println("Book 2 details:");
        b2.displayInfo();
    }
    
}
