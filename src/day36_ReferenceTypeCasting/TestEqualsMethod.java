package day36_ReferenceTypeCasting;

public class TestEqualsMethod {
    public static void main(String[] args) {

        Circle c1 = new Circle(4);
        Circle c2 = new Circle(4);
        Circle c3 = new Circle(5);
        System.out.println(c1 == c2);// compares objects.(memory allocation) Means: false
        System.out.println(c1.equals(c2));//true, since both belong to Circle and have same value
        System.out.println(c1.equals(c3));//false
    }
}
