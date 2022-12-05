package day26_Statics;

public class Iphone {
    public static String brand="Apple";
    public String model;
    public String color;
    public double price;
    public static String os="iOS";
    public static String country="China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean isExpensiveToFix=true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void printPhoneInfo(){ //Instance can share static variables and method, but static cant use instance
        System.out.println("Model: "+ model+" Color: "+color + " Price: "+price + "Brand: "+brand);
    }

    public static void phoneInfo(){
        System.out.println("Brand: "+brand+ " Country of produce: "+country);
    }

}
/*
brand
model
color
price
OS
madeIn
 */