package day28_OOPIntro.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person p1=new Person("Fil",30);
        Person p2=new Person("Kate","Russian");
        Person p3=new Person("Olivia",3,'F');
        Person p4 = new Person("Dima");
        Person p5 = new Person("Elena",'F');
        Person p6 = new Person("Igor","russian",56,'M');

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);// all the parameters that are not set, come as default(0/null/false)

        Person.printPlanetName();
        p1.eat("hot dog");
        p2.drink("sparkling water");




    }
}
