package day36_ReferenceTypeCasting.warmUp;

import java.util.Arrays;

public class IPhone {
    private String brand, model,size,color;
    private double price;
    public IPhone(String brand, String model, String size, String color, double price) {
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

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof IPhone)){
            System.err.println("Not an IPhone object");
            System.exit(1);
        }
          if(model.equalsIgnoreCase( ((IPhone)obj).model) ){ // if same model
              if(color.equalsIgnoreCase( ((IPhone)obj).color) ){ // if same color
                  return true;
              }
          }
        return false;
    }
}
