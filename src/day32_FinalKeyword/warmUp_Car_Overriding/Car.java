package day32_FinalKeyword.warmUp_Car_Overriding;

public class Car {
private String make, model, color;
private int year;
private double price;

public static int numberOfWheels;
public static boolean hasBattery;

static{
    numberOfWheels=4;
    hasBattery=true;
}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
    if(year<=0){
        System.err.println("Invalid year "+year);
        System.exit(1);
    }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid price "+price);
            System.exit(1);
        }
        this.price = price;
    }


    public Car(String model, String color, int year, double price) { // no need for make, since it will always be Class Name
        setMake(getClass().getSimpleName());
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);// we do not use constructor for static variables because they will be executed as many times as constructor
    }
    public void start(){
        System.out.println("For "+ getMake()+ " "+ getModel()+ " press the break and twist the key to ignition");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()

                Extra Conditions for the variables:
                        1. Model of tesla can only be set to:
                            {"Model S", "Model Y", "Model x", "Model 3" };
                        2. colorc of tesla can only be set to one of the followings:
                            {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
                        3. year of the tesla can not be less than 2008
                        4. price of tesla can not be less than 50k
 (edited)
You do not have permission to send messages in this channel.

 */