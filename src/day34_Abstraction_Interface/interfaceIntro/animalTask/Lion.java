package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Lion extends Animal implements Wild {
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+ getBreed()+" eats deer");
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
