package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+ getName()+" eats cat food");
    }


    @Override
    public void play() {
        System.out.println("Cat "+getName()+" loves playing with the sunbeam");
    }

    @Override
    public void drink() {

    }

    @Override
    public void sleep() {

    }
}
