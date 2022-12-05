package day12_CustomMethods;

public class Test {
    public static void main(String[] args) {

        int number =300;
        // in order to call the method from another class you have to call through class name
        CustomMethodsWithParameter.oddOrEven(300);
        // we will then create all the methods in utility class

        Initials.initials("Vasyl","Dobrianski");
        //because it's static modifier we can always call it from another classes


    }
}
