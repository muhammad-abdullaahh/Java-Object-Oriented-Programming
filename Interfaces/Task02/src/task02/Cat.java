package task02;

public class Cat implements Ianimal {
     @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
    @Override
    public void animalType(){
        System.out.println("This is a cat");
    }
}
