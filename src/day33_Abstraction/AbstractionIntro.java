package day33_Abstraction;

public class AbstractionIntro {
    /*
    Abstract method
    Abstract class
    Interface
    Extends vs implements

    Can be applied only if parent-child relationship is established

    'Ignore details'
    Focus on relevant properties of the problem

    Abstraction:
    - process of hiding implementation details from the user (the user knows the functionality, but not how it's done)
    - focus on the essentials qualities of something rather than one specific example(ignore irrelevant and unimportant)
    - user will have information on what the object does instead of the how

    the method is created without the body in parent class:
    instead of : public void eat(){ body }
    use : public void eat();
    it is child class responsibility to complete the body implementation, not parents

    Abstract method:
    - method without the body ( the only method in Java without the body is Abstract method)
    - method meant to be overridden
    - abstract keyword is used to create the method

    can't be final, static or private

    In parent class:
    public abstract void eat();
    public abstract double are();

    in child class:
    eat(){ }
    area() { side*side }


    Abstract Class;
    - a class that must be a parent. The goal of the class is to provide reusable methods and variables for subclasses
    - an abstract keyword must be used in to create abstract class
    - an object cannot be created from abstract class ( cannot be instantiated). Is used for creating reusable methods and variables
    ( concrete class is the class we create objects from. abstract class is the class we use to provide variables and methods for subs)


     Parent class' abstract methods MUST be overridden in non-abstract child classes

     */
}
