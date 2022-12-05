package day34_Abstraction_Interface.carTask;

public class Honda extends Car {

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("To start "+ getMake()+ " "+getModel()+ " insert the key and turn ignition");

    }
}
