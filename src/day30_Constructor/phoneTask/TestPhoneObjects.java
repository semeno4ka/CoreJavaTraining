package day30_Constructor.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        IPhone phone1 = new IPhone("12 Pro Max","Max","Black",1100);
        Samsung phone2 = new Samsung("Galaxy","Medium","Silver",900);
        Nokia phone3 = new Nokia("A33","Small","Black",400);
        phone3.selfDefence();
        phone2.freeze();
        phone1.faceTime("mike@gmail.com");
        System.err.println(phone1.getBrand()+" "+phone1.getModel()+ ", "+phone2.getBrand()+" "+phone2.getModel()+", "+phone3.getBrand()+ " "+phone3.getModel()+" are no longer available in the store");

    }
}
