package day36_ReferenceTypeCasting;

import day29_Inheritance.animalTask.Animal;
import day29_Inheritance.animalTask.Cat;
import day29_Inheritance.animalTask.Dog;
import day30_Constructor.phoneTask.Nokia;
import day30_Constructor.phoneTask.Phone;
import day30_Constructor.phoneTask.Samsung;
import day33_Abstraction.employeeTask.*;
import day35_PolymorphismIntro.transportationTask.AutoPilot;
import day35_PolymorphismIntro.transportationTask.Electric;
import day35_PolymorphismIntro.transportationTask.Tesla;
import day36_ReferenceTypeCasting.warmUp.IPhone;

public class RTC_Practice {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        // Cat cat = new Dog();
        Animal animal = new Dog(); // Polymorphism => Upcasting is implicitly done (Dog objects assigned to a higher - parent class)
        // Animal animal = (Animal) new Dog(); => behind the scene
        System.out.println("----------------------------------");

        Animal animal1 = new Dog();
        animal1.setInfo("Max","Husky","Large","Black",4,'M');
        animal1.eat();
        animal1.drink(); // can call methods for animal class, but not unique for dog lass, such as bark();
        //animal1.bark(); can call methods for animal class, but not unique for dog lass
        Dog dog = (Dog) animal1;
        dog.bark();// for further permanent use
        ( (Dog)animal1 ).bark();// same as dog.bark(); but for one time use only

        // animal1.scratch();
        // ( (Cat)animal1).scratch(); CLASS CAST EXCEPTION since Cat DOESN'T have relationship with DOG object which is animal1

        System.out.println("----------------------------------");
        Phone phone = new Nokia("XR20", "Small", "Black", 350);// Upcasting
        ((Nokia)phone).selfDefence();
        //((IPhone)phone).faceTime(8756845); there is no relationship between phone (Nokia object) and IPhone it will through an exception
        Phone phone2 = new Samsung("Galaxy S17", "Large", "Silver", 650);
        ((Samsung) phone2).freeze();

        System.out.println("----------------------------------");
        Employee e1 = new Developer("Fil",33,'M',"hdfgsk","Software Developer",143000,"Java");
        e1.work();
        System.out.println(((Developer) e1).getProLang());

      //  Tester tester = (Tester)e1;// cannot assign tester to e1 which is Developer object and they have no 'is-a' relationship


        System.out.println("----------------------");
        IPhone p1 = new IPhone("Apple","12","Medium","Black",900);
        IPhone p2 = new IPhone("Apple","12","Medium","Silver",900);
        IPhone p3 = new IPhone("Apple","12","Medium","Black",900);

        //System.out.println(p1.equals(dog1));//false
        System.out.println(p1.equals(p2));//false
        System.out.println(p1.equals(p3));//true

        System.out.println("----------------------");
        Electric electric = new Tesla("Tesla","Model Y","Blue",2020,55000);// upcasting child assigned to parent
        electric.charge();
        ((Tesla)electric).selfDrive();
        ((AutoPilot)electric).selfDrive();// there is a relationship between tesla and autopilot
        System.out.println("----------------------");

        Employee e = new Teacher("Elena",27,'F',"djhsgf","Math teacher",67000);
        Employee e2 =new Tester("Mike",31,'M',"7643ghjf","SDET", 97000);
        Employee e3 =new Developer("Fil",33,'M',"hdfgsk","Software Developer",143000,"Java");
        Employee e4 = new Driver("Joe",43,'M',"weuyr","Driver Long",45000);

        e.work();// without the casting, overridden method gets executed anyway
        ((Teacher)e).work(); // if method is overridden, it always gets executed.
        e2.work();
        e3.work();
        e4.work();


    }
}
