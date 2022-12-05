package day32_FinalKeyword.warmUp_Car_Overriding;

public class TestCarObjects {
    public static void main(String[] args) {


        Honda c1 =new Honda("Accord","Black",2017,30000);
        Toyota c2 = new Toyota("Camry","Red",2008,13000);
        Audi c3 =new Audi("A7","White",2020,54000);
        BMW c4 =new BMW("X5","Grey",2019,48000);
        Tesla c5 = new Tesla("Model 3","Silver",2009,54000);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println("____________________________");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c5.autoPilot();


    }
}
