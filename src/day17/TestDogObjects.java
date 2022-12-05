package day17;

import jdk.swing.interop.SwingInterOpUtils;

public class TestDogObjects {
    public static void main(String[] args) {

        //creating objects from Dog class

        Dog dog1 = new Dog();
        // Class name   object name   keyword    Constructor();
         dog1.name ="Max";
         dog1.breed= "Husky";
         dog1.gender='M';
         dog1.age =4;
         dog1.color = "Gray";
         dog1.size = "Large";

      /*   dog1.eat();
        System.out.println(dog1);// will return the hashcode because required to-String method*/

        Dog dog2 = new Dog();
        dog2.name = "Laura";
        dog2.breed = "Bulldog";
        dog2.gender = 'F';
        dog2.age = 7;
        dog2.color = "White";
        dog2.size = "Medium";

        System.out.println(dog1);
        System.out.println(dog2);
        //To avoid repeating assigning all over again, shoudl create a method with all 6 parameters

        Dog dog3 = new Dog();
        dog3.setInfo("Loki","Husky", 'F',3,"Small","Black");

    }
}
