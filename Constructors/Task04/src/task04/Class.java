package task04;

public class Class {
    private String model;
    private int ssd;
    public Class(String model,int ssd){
        this.model=model;
        this.ssd=ssd;
    }
    public Class(Class other){
        this.model=other.model;
        this.ssd=other.ssd;
    }
    public void displayInfo(){
        System.out.println("The model of the laptop is "+model);
        System.out.println("The ssd space is "+ssd+" gb.");
    }
}
