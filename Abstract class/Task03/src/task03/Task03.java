package task03;

public class Task03 {

    public static void main(String[] args) {
        Shape s1 = new Circle("Green",9.56);
        System.out.println("The area of the circle is "+s1.calArea()+" sq");
        s1.displayColor();
        Shape s2 = new Rectangle("Yellow",9.56,8.7);
        System.out.println("The area of the rectangle is "+s2.calArea()+" sq");
        s2.displayColor();
    }
    
}
