package day34_Abstraction_Interface.carTask;

public class TestCarObjects {
    public static void main(String[] args) {


        Honda car1 = new Honda("Accord","Black",2007,13000);
        Audi car2 = new Audi("A7","White",2020,64000);
        Tesla car3 = new Tesla("Model Y","Silver",2020,69000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1.stop();
        car2.stop();
        car3.stop();
        car1.start();
        car2.start();
        car3.start();
        car2.autoPark();
        car3.autoPilot();

    }
}
