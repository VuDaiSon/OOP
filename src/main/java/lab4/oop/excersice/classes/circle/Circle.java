package lab4.oop.excersice.classes.circle;


public class Circle {
    private double radius = 1.0;
    private String color;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return Math.PI * 2 * radius;
    }
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
