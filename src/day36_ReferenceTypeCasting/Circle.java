package day36_ReferenceTypeCasting;

public class Circle {

        private double radius;
        public final static double Pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*Pi;
    }
    public double perimeter(){
        return 2*radius*Pi;
    }

    public String toString() {
        return "Circle{" +
                " radius = " + radius +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                '}';
    }

    // == will compare the objects
    // .equals() compare the value of objects

    @Override
    public boolean equals(Object obj) { // first we check whether the passing object belongs to Circle class
        if (!(obj instanceof Circle)) {
            System.err.println("Invalid object");// if not, we should not compare
            System.exit(1);
        }
        if(radius == ((Circle) obj).radius){// casting from Object class to Circle class is required
return true;// if the current circle radius  ==  the given circle radius
        }
        return false;
    }
}
