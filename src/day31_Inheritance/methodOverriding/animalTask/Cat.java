package day31_Inheritance.methodOverriding.animalTask;

public class Cat extends Animal {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat(){// if there are no parameters ion parent method, you cannot give any either, it will be overloading, not overriding
        System.out.println("Cat "+ getName()+ " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+ getName()+ " is sleeping 16 hours a day");
    }

    @Override
    public void drink() { // if you do not need different implementation, you do not need to override anything, just skip the method
        System.out.println("Cat "+ getName()+ " drinks only fresh clean water and milk");
    }
    public void scratch(){
        System.out.println(getName()+ " scratches");
    }
}
