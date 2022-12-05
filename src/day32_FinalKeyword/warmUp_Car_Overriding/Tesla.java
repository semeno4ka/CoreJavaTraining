package day32_FinalKeyword.warmUp_Car_Overriding;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public final class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start() {
        System.out.println("Say: \"Start\"");
    }
    public void autoPilot(){
        System.out.println("Has auto pilot installed");
    }
    // if you put final - you cannot change the body, but the method can still be inherited.
    // IN ORDER  to restrict autopilot method in other classes, you should make the class final

    public void setModel(String model) {
        String[] models = {"Model S", "Model Y", "Model x", "Model 3"};
       if(!Arrays.asList(models).contains(model)){
            System.err.println("Invalid "+getMake()+" model");
            System.exit(1);
        }
        super.setModel(model);//this.model=model will execute the code from parent class
    }

    public void setColor(String color) {
        // we can use Arraylist instead of Array
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if(!colors.contains(color)){
            System.err.println("Invalid color for "+getMake()+ " "+getModel());
            System.exit(1);
        }
        super.setColor(color);
    }

    public void setYear(int year) {
        if(year<2008){
            System.err.println("Invalid year for "+getMake()+ " "+getModel());
            System.exit(1);
        }
        super.setYear(year);
    }


    public void setPrice(double price) {
        if(price<50000){
            System.err.println("Invalid price for "+getMake()+" "+getModel()+" : $"+price);
            System.exit(1);
        }
        super.setPrice(price);
    }
}
/*
 Extra Conditions for the variables:
                        1. Model of tesla can only be set to:
                            {"Model S", "Model Y", "Model x", "Model 3" };
                        2. colors of tesla can only be set to one of the followings:
                            {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
                        3. year of the tesla can not be less than 2008
                        4. price of tesla can not be less than 50k
 */