package day30_Constructor.phoneTask;

public class Nokia extends Phone{


    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }
    public void selfDefence(){
        System.out.println(getBrand()+ " "+ getModel()+" is mostly used as a self-defence tool, not phone");
    }
}
