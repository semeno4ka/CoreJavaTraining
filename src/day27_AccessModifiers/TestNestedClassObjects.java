package day27_AccessModifiers;

public class TestNestedClassObjects {
    public static void main(String[] args) {

        Car obj1 =new Car();// Car object

        obj1.new CarEngine(); // that is how inner class objects are created. Through Outter class objects
        Car.CarEngine obj2 = obj1.new CarEngine();// Car engine object

        new Car.StaticInnerClass();// no need for objects, called through Class name
        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();
    }
}
