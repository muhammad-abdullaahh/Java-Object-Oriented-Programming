package task01;

public class Book {
    private String title,author;
    private double price;
    public Book(String title,String authro,double price){
        this.title = title;
        this.author=author;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("The name of the book is "+title);
        System.out.println("The name of the author is "+author);
        System.out.println("The price of the book is "+price+"$");
    }
}
