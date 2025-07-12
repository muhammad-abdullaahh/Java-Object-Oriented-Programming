package task02;

public class Professor {
    private String name,mail;
    public Professor(String name,String mail){
        this.name=name;
        this.mail=mail;
    }
    public void displayInfo(){
        System.out.println("The name of the professor is "+name);
        System.out.println("The mail of the professor is "+mail);
    }
}
