package day35_PolymorphismIntro;

public class Abstract_vs_Interface {
    /*
    Both are used for achieving abstraction
    Both cannot be instantiated
    Both are meant to be inherited
    Both cannot be final

    Abstract:
    - it is a Class
    - only one class can be extended
    - instance & static both are supported
    - constructor can be created for future child classes
    - all 4 access modifiers are supported
    - variables are encapsulated
    - methods could be instance,static, abstract

    Interface:
    - not a Class
    - one class can implement as many interfaces as needed
    - there are no instance variables and methods, only static and final
    - constructor cannot be created
    - only public access modifier( private after version 9)
    - methods could be static, abstract, default(treated as instance)

    extends vs implements:
            extends: is used between same types( class extends class, interface extends interface, multiple interfaces)
            implements: is only used between a class and interface(interfaces)

    extends & implements:
    - extending a class should go in the first place
    - implemented interfaces are just separated by ','


     */
}
