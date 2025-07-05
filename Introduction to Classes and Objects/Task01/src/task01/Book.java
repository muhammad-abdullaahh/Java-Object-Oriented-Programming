package task01;

public class Book {
    String title,author;
    double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Book title: "+title);
        System.out.println("Author name: "+author);
        System.out.println("Book price: "+price+"$");
    }
}
