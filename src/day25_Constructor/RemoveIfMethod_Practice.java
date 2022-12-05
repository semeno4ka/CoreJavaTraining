package day25_Constructor;

import day17_CustomClasses.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod_Practice {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        //before we used loop.
       /* for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("Small")){
                smallDogs.add(dog);
            }
        }
        System.out.println(smallDogs);*/
        smallDogs.removeIf(p-> !p.size.equalsIgnoreCase("Small"));
        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(p-> p.age>4);
        // for printing just the name, loop will be required
        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p-> p.gender=='M');
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p-> p.gender=='F');

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        // removes small from Array and return Array
        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf(p-> p.size.equalsIgnoreCase("Small"));
        //Reassign back to Array, not ArrayList

        dogs2 = list.toArray(new Dog[0]);// if you PUT ZERO, the size of NEW ARRAY WILL BE ADJUSTED to list size !!!!!
        //greater size will give null. If you out ZERO it adjusts. You can also put new Dog [list.size()]
        System.out.println(Arrays.toString(dogs2));

    }
}
