package task01;

public class Library {
    private String name;
    private Book book;
    public Library(String name,Book book){
        this.name=name;
        this.book=book;
    }
    public void displayInfo(){
        System.out.println("The name of the library is "+name);
        System.out.println("The books in this library are: ");
        book.displayInfo();
    }
}
