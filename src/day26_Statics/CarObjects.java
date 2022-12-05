package day26_Statics;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Audi");
        System.out.println(car1);

        Car car2 = new Car("BMW","X6");
        System.out.println(car2);

        Car car3 = new Car("Toyota","Camry",2008);
        System.out.println(car3);

        Car car4 = new Car("Lexus","RX300", 2019,27500);
        System.out.println(car4);

        Car car5 = new Car("Honda", "Accord",2017,30500,"Grey");
        System.out.println(car5);
    }
}
