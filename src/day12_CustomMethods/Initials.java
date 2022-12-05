package day12_CustomMethods;

import java.util.Locale;

public class Initials {
    public static void main(String[] args) {
        initials("ekaterina", "sementeva");//String should be written in ""

    }
    public static void initials(String firstName, String lastName){
        firstName=firstName.substring(0,1).toUpperCase();
        lastName=lastName.substring(0,1).toUpperCase();
        System.out.println(firstName+"."+lastName+".");
//Second way
        /*
        String initial=firstName.charAT(0) + "." + lastName.charAt(0);
        System.out.println("Initials: " + initials)
         */
    }

}
