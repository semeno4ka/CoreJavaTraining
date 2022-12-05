package day31_Inheritance.methodOverriding.shape_Overriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square sq1 = new Square(4);
        System.out.println(sq1);
        System.out.println(sq1.area());
        System.out.println(sq1.perimeter());
        sq1.draw();

        Circle c1 = new Circle(3.5);
        System.out.println(c1);
        c1.area();
        c1.perimeter();
        c1.draw();

    }
}
