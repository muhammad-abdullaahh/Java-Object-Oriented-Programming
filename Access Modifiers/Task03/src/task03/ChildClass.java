package task03;

public class ChildClass extends ParentClass {
     public void showMessage() {
        System.out.println(message);  // Accessing protected variable from Parent
    }
}
