package task02;

public class Dog implements Ianimal  {
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
    @Override
    public void animalType(){
        System.out.println("This is a dog");
    }
}
