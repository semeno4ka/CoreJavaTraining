package day30_Constructor.typesOfInheritance;

class A{
    public int a = 100;
}

public class FieldHiding extends A {
    /*
    happens between parent and child classes
     */
    public int a = 300; // a=100 will not be inherited, because same variable cannot be duplicated

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);// 300
    }
}
