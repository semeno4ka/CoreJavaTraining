package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Shark extends Animal implements Wild, Swimmable{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("sharks "+ getBreed()+" eat fish");

    }

    @Override
    public void hunt() {

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
