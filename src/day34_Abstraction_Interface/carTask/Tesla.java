package day34_Abstraction_Interface.carTask;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say: \"Start\" - to start "+getMake()+" "+getModel());
    }
    public void autoPilot(){
        System.out.println(getMake()+ " "+getModel()+ " has pre-installed autopilot function");
    }
}
