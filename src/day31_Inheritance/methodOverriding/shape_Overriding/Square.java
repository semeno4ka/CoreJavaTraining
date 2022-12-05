package day31_Inheritance.methodOverriding.shape_Overriding;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public void draw() {
        // give a code fragment for square
        super.draw();
        System.out.println("\t* * * * *");
        for (int i = 0; i <3 ; i++) {
            System.out.println("\t*       *");
        }
        System.out.println("\t* * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name = '" + getName() + '\'' +
                ", area = '" + area() + '\'' +
                ", side = '" +side + '\'' +
                ", perimeter = '" + perimeter() + '\'' +
                '}';
    }
}
