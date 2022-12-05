package day38_ExceptionsPart2.CustomExceptions.shapeTask;

public class Circle {

    private double radius;

    public Circle(double radius) {
      setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new InvalidShapeException("Invalid radius. Cannot be negative or zero. Provided: "+radius);
        }
        this.radius = radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
