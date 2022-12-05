package day35_PolymorphismIntro.polymorphism;

import day27_AccessModifiers.Circle;
import day34_Abstraction_Interface.carTask.Audi;
import day34_Abstraction_Interface.carTask.Honda;
import day34_Abstraction_Interface.carTask.Tesla;
import day34_Abstraction_Interface.interfaceIntro.animalTask.*;

import java.util.Arrays;

public class PolymorphismIntro {
    /*
    Ability for one object to exist in multiple forms

    Parent class/Interface is reference type and an Object is created from a child class
    (Parent class)
    Animal animal1 = new Dog();              'is-a' relationship is a MUST
    Flyable animal2= new Eagle();
    (Parent interface)

    Parent can reference to any CHILD object as long as 'is-a' relationship is established

    - Only reference type variables and methods can be called
    - when a method is called, it will call overridden version from a child class
    - if the method is not overridden, it will call parent class version

    INSTANCEOF
    checks if the objects is in certain class(returns boolean)


     */

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',3,"Large","Grey");

        Cat cat = new Cat("Minnie","Persian",'F',4,"Medium","White");

        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion= null;
       /* Dog[] animals = {dog, cat, tiger, lion, eagle};// there is no relationship between dog and the rest of the animals.

        in order to create an array to store all the animal, we will need to choose a class,
        which cannot be just one - cat or dog, it should be something common, which contains both cat and dog and any other animal

        Parent can reference ALL CHILD OBJECTS
        Once the parent is reference type, you cannot call methods from child class
        */
        Animal[] animals = {dog, cat, tiger, lion, eagle};
        Animal animal1 = dog;
        Animal animal2 = cat;
        Animal animal3 = tiger;
        Animal animal4 = new Cat("Mercy","Persian",'F',6,"Medium","Black");
        animal1.eat();// eat is the only method in paretn class, can't have any other methods from child class

        System.out.println("---------------OBJECTS CLASS---------------");


        String str="Java";
        Integer n = 100;
        Boolean r =false;
        Double d = 10.5; // Objects through Wrapper Class

        Circle circle = new Circle(4);

        Honda car1 = new Honda("Accord","Black",2007,13000);
        Audi car2 = new Audi("A7","White",2020,64000);
        Tesla car3 = new Tesla("Model Y","Silver",2020,69000);

        Object[] objects = {str,n,r,d,circle, car1, car2, car3}; // Object Class has 'is-a' relationship with every object in Java
        System.out.println(Arrays.toString(objects));

    }
}
