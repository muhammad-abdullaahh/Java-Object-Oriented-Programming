package task01;

public class Student {
    static int count=0;
    public Student(){
        count++;
        System.out.println("Student object created....Total students now: "+count);
    }
}
