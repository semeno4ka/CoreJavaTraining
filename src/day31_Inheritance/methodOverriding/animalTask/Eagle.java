package day31_Inheritance.methodOverriding.animalTask;

public class Eagle extends Animal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " pray on snakes");
    }

}
