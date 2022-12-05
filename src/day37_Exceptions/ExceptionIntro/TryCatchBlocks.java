package day37_Exceptions.ExceptionIntro;

import java.util.Locale;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Program started");
        try {
            System.out.println(9 / 0);// arithmatic exception
            System.out.println("Try block");// wasn't executed
        } catch (
                ArithmeticException e) { // classcast exception doesnt have any 'IS A' relationship, thus, exception cant be handled
            System.out.println("Catch block");// didn't catch the exception, because no relationship
        }

        System.out.println("Program ended");
        System.out.println("------------------------------------------");
        System.out.println("Program2 started");
        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("Catch block");
        }


        System.out.println("Program2 ended");
        System.out.println("--------------------");
        System.out.println("Program3 started");
        try {
            Thread.sleep(5000);// checked exception
            System.out.println("Try block");
        } catch (InterruptedException e) {
            System.out.println("Catch block");
        }
        System.out.println("Program3 ended");
    }
}
