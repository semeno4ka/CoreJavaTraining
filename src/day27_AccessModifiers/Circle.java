package day27_AccessModifiers;

public class Circle {
    public double radius, diameter;
    public static double pi=3.14;

    public Circle(double radius){// provide a certain parameter only if it is a must to calculate other instances
        this.radius=radius;
        diameter= radius*2;
    }
    public double calcArea(){// static only accepts static, instance can accept both instance and static
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return radius*pi*2;
    }
    public static void printPiValue(){
        System.out.println("PI' value is: "+pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                ", PI =" + pi +
                '}';
    }
}
