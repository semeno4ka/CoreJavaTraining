package day31_Inheritance.methodOverriding.animalTask;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Emy","Bangle",'F',3,"M","Brown");
        Dog dog = new Dog("Max","Husky",'M',4,"L","Grey");
        Lion lion = new Lion("Simba","African Lion",'M',6,"L","Yellow",true);
        Eagle eagle=new Eagle("Bella","American Eagle",'F',7,"S","Black");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);
        System.out.println("                  ----------------                ");
        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();
        System.out.println("                  ----------------                ");
        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();
        System.out.println("                  ----------------                ");
        cat.drink();
        dog.drink();
        lion.drink();
        eagle.drink();
        System.out.println("                  ----------------                ");
        cat.scratch();
        lion.hunt();


    }
}
