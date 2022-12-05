package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Parrot extends Animal implements Playable,Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+ getName()+" eats parrot food");
    }

    @Override
    public void play() {
        System.out.println(getName()+" loves playing with his fellow parrot");
    }

    @Override
    public void fly() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void sleep() {

    }
}
