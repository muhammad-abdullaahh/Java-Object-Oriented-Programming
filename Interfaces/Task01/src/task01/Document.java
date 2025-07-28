package task01;

public class Document implements Iprintable {
    @Override
    public void displayInfo(){
        System.out.println("This is the document class implemented from Iprintable interface");
    }
}
