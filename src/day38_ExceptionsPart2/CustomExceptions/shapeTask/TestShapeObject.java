package day38_ExceptionsPart2.CustomExceptions.shapeTask;

public class TestShapeObject {
    public static void main(String[] args) {


        Circle c1 = new Circle(5);
        c1.setRadius(0);
        System.out.println(c1); //Invalid shape exception will pop up during runtime
    }
}
