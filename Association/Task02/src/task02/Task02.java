package task02;

public class Task02 {

    public static void main(String[] args) {
        Professor p1 = new Professor("Abdullah","abdullah123@gmail.com");
        Department d1 = new Department("Department of Software engineering","Sir Faisal",p1);
        d1.displayInfo();
        
    }
    
}
