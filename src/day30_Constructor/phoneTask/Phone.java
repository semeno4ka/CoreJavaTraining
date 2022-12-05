package day30_Constructor.phoneTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Phone {
  private String brand, model,size,color;
  private double price;
    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

  public String getBrand(){
      return brand;
  }
  public void setBrand(String brand){
this.brand=brand;
  }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }
//PAY ATTENTION TO THE WAY IT IS SOLVED
    public void setColor(String color) {
      String[] colors ={ "Black","White","Silver","Gold","Pink"};
      if(Arrays.asList(colors).contains(color)){
          this.color=color;
      }else{
          System.err.println("The color of the phone can on be "+Arrays.toString(colors));
          System.exit(1);
      }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
      if(price<=0){
          System.err.println("Invalid price " +price);
          System.exit(1);
      }
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					toString(): prints Iphone object info when the object is passed in the print statement

 */