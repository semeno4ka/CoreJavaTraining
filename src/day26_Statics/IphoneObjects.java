package day26_Statics;

public class IphoneObjects {
    public static void main(String[] args) {

        Iphone iPhone = new Iphone("Iphone12","Black",1000);
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();
        System.out.println(Iphone.brand); //Should be called through class name, not the object
        System.out.println(Iphone.os); //Should be called through class name, not the object
        iPhone.phoneInfo();


    }
}
