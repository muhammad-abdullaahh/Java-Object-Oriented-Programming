package task01;

public class Book implements Iprintable{
    @Override
    public void displayInfo(){
        System.out.println("This is the book class implemented from Iprintable interface");
    }
}
