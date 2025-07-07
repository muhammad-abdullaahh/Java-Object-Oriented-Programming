package task03;

public class Task03 {

    public static void main(String[] args) {
         // Create an array of Shape references
        Shape[] shapes = new Shape[3];

        // Store different subclass objects
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        // Call overridden draw() methods
        for (Shape shape : shapes) {
            shape.draw(); // Calls the correct draw() method depending on object type
        }
    }
    
}
