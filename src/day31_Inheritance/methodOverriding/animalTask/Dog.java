package day31_Inheritance.methodOverriding.animalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println(getName()+ " loves drinking a lot");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats dog food");
    }

    @Override
    public void sleep() {
        System.out.println(getBreed()+" do not sleep as much as cats do");
    }
    public void bark(){
        System.out.println(getName()+" loves barking");
    }
}
