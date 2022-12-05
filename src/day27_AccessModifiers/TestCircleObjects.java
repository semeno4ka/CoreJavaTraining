package day27_AccessModifiers;

public class TestCircleObjects {
    public static void main(String[] args) {
        Circle circle1=new Circle(3.5);
        Circle circle2=new Circle(5);
        Circle circle3=new Circle(7);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3); // instances can only be called through objects
        System.out.println(circle1.pi);// static can be called through object. It is preferred to call them through CLass
        System.out.println(Circle.pi); // the right way to call any static
    }
}
