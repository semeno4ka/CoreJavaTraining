package day35_PolymorphismIntro.polymorphism;

import day34_Abstraction_Interface.interfaceIntro.animalTask.Animal;
import day34_Abstraction_Interface.interfaceIntro.animalTask.Eagle;
import day34_Abstraction_Interface.interfaceIntro.animalTask.Flyable;
import day34_Abstraction_Interface.interfaceIntro.animalTask.Tiger;

public class PolymorphismPractise {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Simba","Bengal",'M',4,"Large","Orange");
        tiger.eat();
        tiger.drink();
        tiger.hunt();

        Animal tiger2 = new Tiger("Khan","Bengal",'M',6,"Large","White");
        tiger2.eat();
        tiger2.drink();
        // tiger2.hunt(); cannot call hunt

        Animal animal = new Eagle("John","American Eagle",'M',3,"Large","Brown");
        animal.eat();// cannot call fly method which belongs to Eagle class

        Flyable animal2 = new Eagle("John","American Eagle",'M',3,"Large","Brown");
        animal2.fly();
       // animal2.eat(); cannot call any other methods other than fly
        System.out.println(animal2.canFly);

        Flyable[] birds = {animal2};// since every bird has inherited Flyable interface I cannot put Not flyable animals
        System.out.println("--------------");
        Object cydeoCar=null;
        boolean isAnimal = cydeoCar instanceof Animal;
        System.out.println(isAnimal); //false
        isAnimal= tiger instanceof Animal;
        System.out.println(isAnimal);//true

    }
}
