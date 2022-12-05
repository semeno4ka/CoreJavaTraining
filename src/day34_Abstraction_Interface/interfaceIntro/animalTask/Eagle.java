package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Eagle extends Animal implements Wild, Flyable {

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+ getBreed()+" eat snakes");
    }

    @Override
    public void hunt() {

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
