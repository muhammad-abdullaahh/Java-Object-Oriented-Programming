package task03;

public class Grandson extends Grandpa  {
    private String name,caste;
    public Grandson(String name,String caste){
        super(name,caste);
        this.name=name;
    }
    @Override
    public void displayInfo(){
        System.out.println("The name of grandson is "+name);
        System.out.println("The caste is "+caste);
    }
}
