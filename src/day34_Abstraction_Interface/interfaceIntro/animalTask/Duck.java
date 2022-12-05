package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimmable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+ getName()+" eats worm");

    }

    @Override
    public void play() {
        System.out.println("Duck "+getName()+" loves playing with little ducks");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void sleep() {

    }
}
