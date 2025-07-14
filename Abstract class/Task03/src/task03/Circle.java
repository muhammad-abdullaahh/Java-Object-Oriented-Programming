package task03;

public class Circle extends Shape {
    private double radius,area;
    private final double pi=3.14;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    @Override
    protected double calArea(){
        area=pi*(radius*radius);
        return area;
    }
}
