package task02;

public class Department {
    private String departName,hodName;
    private Professor professor;
    public Department(String departName,String hodName,Professor professor){
        this.departName = departName;
        this.hodName=hodName;
        this.professor=professor;
    }
    public void displayInfo(){
        System.out.println("The name of the department is "+departName);
        System.out.println("The hod of the department is "+hodName);
        System.out.println("The professor details are :");
        professor.displayInfo();
    }
}
