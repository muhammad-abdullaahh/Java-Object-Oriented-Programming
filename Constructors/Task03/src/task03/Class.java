package task03;

public class Class {
    String name,bloodGroup;
    int age;
    public Class(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Class(String name,int age,String bloodGroup){
        this.name=name;
        this.age=age;
        this.bloodGroup=bloodGroup;
    }
    public void displayInfo(){
        System.out.println("Person name: "+name);
        System.out.println("Person age: "+age);
        System.out.println("Person blood group: "+bloodGroup);
    }
    
}
