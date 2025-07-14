package task03;

public abstract class Shape {
    String color;
    public Shape(String color){
        this.color=color;
    }
    protected abstract double calArea();
    protected void displayColor(){
        System.out.println("The color of the shape is "+color);
    }
}
