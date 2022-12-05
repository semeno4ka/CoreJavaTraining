package day29_Inheritance.animalTask;

public class Cat extends Animal{

    public void scratch(){
        System.out.println(getName()+ " scratches");
    }

    public void meow(){
        System.out.println(getName() + " meows");
    }

}
