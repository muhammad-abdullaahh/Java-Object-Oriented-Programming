package task04;

public class Rectangle {
    double area,perimeter,length,breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calArea(){
        area=length*breadth;
        return area;
    }
    public double calPerimeter(){
        perimeter=2*(length+breadth);
        return perimeter;
    }
    public void displayInfo(){
        System.out.println("The area of the rectangle is "+calArea()+"cm.");
        System.out.println("The perimetere of the rectangle is "+calPerimeter()+"cm.");
    }
}
