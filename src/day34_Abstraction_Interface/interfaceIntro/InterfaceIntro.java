package day34_Abstraction_Interface.interfaceIntro;

public class InterfaceIntro {
    /*
    - interface is a blueprint of a class ( class is a blueprint of an object)
    - 'interface' keyword is used to create interface
    - Specifies the behavior that a class should implement
    - provides additional methods that class(es) need
    - we can achieve 100% abstraction using interface

    everything in interface is abstract by default even without using the word abstract

    Interface allows multiple inheritance which cannot be achieved using two parent classes in Java.
    You can extend class and implement several interfaces, thus you'll have unique methods for different classes and objects
    Thus, cat and eagle can inherit common features from abstract class Animal, and eagle can inherit and implement additional methods from interface( such as fly, which is unique for objects which can fly)

    Interface is independent. Can be implemented for a variety of different classes in the future. Like interface with fly method can also be implemented for airplane class
    Interface is not a CLASS, it is a template for class creation
    It doesn't have to have "is a" relationship

    If you do not use interface, you will end up creating unique methods for each class later on

    Multiple inheritance:
    public class Falcon extends Animal implements Wild,Flyable{}

    There is nno limit for the class on the number of the interfaces it can inherit, but you HAVE to override all abstract methods

    Properties of Interface
    - variables are static and final by default
    - interface can have static methods, abstract methods(used most of the time) and default methods(default is treated as instance method once inherited)
    - public is the only access modifier that can be used in interface and is given by default(except for static methods, after version 9 private access modifier can be used, but most companies use version 8, so they do not use private)
    - abstract keyword is given by default to the abstract methods


    Variables: static and final (will be static and final b y default)
    Methods: static, abstract and default

    int a = 100; static and final be default
    void method(); abstract by default
    static void method2(); static method
    default void method3(); default method which will be treated as instance

    You cannot have:

    - interface cannot have instance variables, methods and constructors since it is not a class, it does not create objects
    - interface cannot have initializer blocks

Variable by default are public static and final

     */
}
