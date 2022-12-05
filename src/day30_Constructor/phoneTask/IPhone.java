package day30_Constructor.phoneTask;

public class IPhone extends Phone {

    public IPhone(String model, String size, String color, double price){
      super("Apple",model,size,color,price);// brand is known for every IPhone
    // we do not need a brand parameter in IPhone constructor, we can set same APPLE brand within parent constructor
    }

    public static boolean hasApplePay=true;
    public void faceTime(long phoneNumber){
        System.out.println(getModel()+ " is Facetiming "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getModel()+ " is Facetiming "+ email);
    }
}
