package day27_AccessModifiers;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{
        //new Class under the Car Class because they correlated. Nested class. CarEngine: inner Class, Car: outter Class
        // can only have non static variables, since it is not static class
        public void method(){
            System.out.println(make);// accepts both static and instances
            System.out.println(wheels);// inner class can access all outer class. Outer class objects have to be declared first
        }
    }
    public static class StaticInnerClass{
        // accepts only static from outter class
        public void method(){
            System.out.println(wheels);// only static acceptable, no instances
        }


    }

}
