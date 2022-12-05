package day31_Inheritance.methodOverriding;

public class MethodOverriding {
    /*
    Happens only in subclasses where inheritance is applied

    Method Overriding:
    - gives different implementations to the method (f.e. different formula for same calcArea method() )
    - overriding can only take place in subclasses
    - less memory usage and improves re-usability
    - return type and parameters as well as the method name should be the same as parent's
    - the access modifier should be same as parents or more visible (can't be more restricted)
    - static method CANNOT be overriden since it belongs to the Class, not object. Only one copy is always created
    - final method CANNOT be overriden
    - only instance methods that are not private and do not have final specifier can be overriden
    - if there are no parameters ion parent method, you cannot give any either, it will be overloading, not overriding
    - if you do not need different implementation, you do not need to override anything, just skip the method
    - to check whether the method is overridden, you can place @Override that will show or will not show a mistake


     this. - applied to class variables and methods
     this() - applied to class constructor

     super. - applied top parent class variables and methods
     super() = applied to parent class constructor



     */
}
