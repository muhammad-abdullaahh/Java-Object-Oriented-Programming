package task05;

public class Circle {
    final double pi=3.14;
    double radius,area,circumference;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calArea(){
        area=pi*(radius*radius);
        return area;
    }
    public double calCircumference(){
        circumference = 2*pi*radius;
        return circumference;
    }
    public void displayInfo(){
        System.out.println("The area of the cicle is "+calArea()+"cm.sq");
        System.out.println("The circumference of the ciircle is "+calCircumference()+"cm");
    }
}
