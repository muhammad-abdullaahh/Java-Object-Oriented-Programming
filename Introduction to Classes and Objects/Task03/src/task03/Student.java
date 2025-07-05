package task03;

public class Student {
    String name;
    int classOfStudent;
    double percentage,scoredMarks,totalMarks=550;
    public Student(String name,int classOfStudent,double scoredMarks){
        this.name=name;
        this.classOfStudent=classOfStudent;
        this.scoredMarks=scoredMarks;
    }
    public double calPercentage(){
        percentage=(scoredMarks/totalMarks)*100;
        return percentage;
    }
    public void displayInfo(){
        System.out.println("Student's name: "+name);
        System.out.println("Student's class: "+classOfStudent);
        System.out.println("Scored percentage: "+calPercentage()+"%");
    }
}
