package task03;

public class Grandpa {
    protected String caste,name;
    public Grandpa(String name,String caste){
        this.name=name;
        this.caste=caste;
    }
    public void displayInfo(){
        System.out.println("The caste is "+caste);
    }
}
