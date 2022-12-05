package day36_ReferenceTypeCasting;

public class ReferenceTypeCastingIntro {
    /*
    Reference Type Casting (casting - converting from one type to another)

    Two Types of Type Casting:
     1. Primitive Type Casting (happens between primitives) :
        - explicit( manual from big to small )
        - implicit( auto from small to big )
     2. Reference Type Casting (between reference types)
        - casting one reference type into another
        - 'is-a' relationship is a must for reference casting to happen
        : parent can be converted to child(Downcasting) and child can be converted to parent(Upcasting)

        If there is not 'is-a' relationship, ClassCastException will be thrown
        That is why it is better to use 'INSTANCEOF' to check whether is or is not a relationship

        UPCASTING is done implicitly and cast operator is NOT REQUIRED to be given
        Allows us ti achieve polymorphism without any explicit action.
        Animal animal1 = new Cat(); - Upcasting

        DOWNCASTING is done explicitly and cast operator IS REQUIRED to be given
        Casting the super type object to a subclass type (Casting a parent class object to child's object)
        Since the reference type(as parent) decides what is accessible or not accessible, you cannot access unique
        variables and methods of a child.
        Due to Downcasting,you are able to access child's methods and variables:

        Animal animal = new Dog();
        Dog dog = (Dog) animal; => downcasting  (if you are going to reuse the method)
        For one time use, I do not need to reassign it, I can just cast it before using extra () which mean that I should do it first:
        ( (Dog)animal ).bark();

        The Shortcut for Downcasting can be achieved through IntelliJ suggestion (Cast to....)

        OOP Polymorphism: parent type being referenced to the child object
                          ability of the objects to take on many forms
                          'IS A' relationship is a must
                          Reference type can be either parent or parent interface, and object must be created from child class
                          Reference type decides what can be accessed or called (that is the reason we have downcasting, to access features that are in object type, not reference type)
                          If method is overridden, it always gets executed, even if it belongs to child object

       Runtime Polymorphism(Dynamic polymorphism) - method overriding (multiple method implementations. One method, several implementation)
                            runtime- because it is only revealed during runtime of method

       Compile time polymorphism(method overloading) - happens with multiple methods with the same name(overloading)
       static polymorphism                             each method has one implementation only Several methods, one name
                                                       compile - revealed during compile time

  OVERRIDING EQUALS METHOD IS A MUST TO GIVE PROPER CONDITIONS IN CASTING

     */
}
