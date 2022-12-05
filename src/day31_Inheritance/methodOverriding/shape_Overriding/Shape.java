package day31_Inheritance.methodOverriding.shape_Overriding;

public class Shape {
    private String name;

    public Shape() { // since every shape will have the same name as class, we can skip parameter and place it this way:
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0; //since all shapes have different formula, we'll set it indivially through overriding
    }

    public double perimeter(){
        return 0; // same as area
    }

    public void draw(){
        System.out.println("Drawing a shape "+ getClass().getSimpleName());
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name = '" + name + '\'' +
                ", area = '" + area() + '\'' +
                ", perimeter = '" + perimeter() + '\'' +
                '}';
    }
}
