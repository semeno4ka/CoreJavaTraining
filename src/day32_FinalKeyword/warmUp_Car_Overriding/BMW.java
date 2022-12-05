package day32_FinalKeyword.warmUp_Car_Overriding;

public class BMW extends Car{
    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Call mechanic or jump start if you want to start "+getMake()+ " "+getModel());
    }
}
