package day29_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);
        Cat cat = new Cat();
        System.out.println(cat);
        Tiger tiger =new Tiger();
        System.out.println(tiger);
        dog.setInfo("Max","Husky","Large","Grey",5,'F');
        cat.setInfo("Lisa","Abyssinian","Medium","Brown",3,'F');
        tiger.setInfo("Persi","Bengal","Large","Red",8,'M');
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);


        System.out.println("                            ");
        dog.eat();;
        dog.sleep();
        dog.drink();
        dog.bark();
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.scratch();
        cat.meow();
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.roar();
        tiger.hunt();
        System.out.println(dog.getName());
        System.out.println(cat.getBreed());
        System.out.println(tiger.getColor());
        tiger.setColor("white");
        System.out.println(tiger.getColor());
    }
}
