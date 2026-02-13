package lab6.inheritance.composition.vs.inheritance.circle.and.cylinder.classes.using.composition;

public class Cylinder {
    Circle base;
    double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle();
        base.setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle();
        base.setRadius(radius);
        base.setColor(color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return Math.PI * base.radius * base.radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "base=" + base +
                ", height=" + height +
                ']';
    }
}
