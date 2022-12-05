package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable, Wild{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+" eat fish");
    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void sleep() {

    }
}
