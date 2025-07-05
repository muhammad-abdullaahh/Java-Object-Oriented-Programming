package task02;

public class Class {
    String name;
    int age;
    public Class(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
