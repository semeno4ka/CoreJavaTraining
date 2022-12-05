package day34_Abstraction_Interface.interfaceIntro.animalTask;

public class Tiger extends Animal implements Wild {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" eat whatever they pray for");

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
