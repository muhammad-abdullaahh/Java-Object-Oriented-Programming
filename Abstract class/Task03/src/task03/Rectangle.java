package task03;

public class Rectangle extends Shape {
    private double length,width,area;
    public Rectangle(String color,double length,double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    protected double calArea(){
        area=length*width;
        return area;
    }
}
