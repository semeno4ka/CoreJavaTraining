package day31_Inheritance.methodOverriding.shape_Overriding;

public final class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return radius*6.28;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println();// insert code fragment for circle
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name = '" + getName() + '\'' +
                ", area = '" + area() + '\'' +
                ", radius = '" + radius + '\'' +
                ", perimeter = '" + perimeter() + '\'' +
                '}';
    }
}
