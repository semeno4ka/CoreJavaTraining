package day38_ExceptionsPart2.ThrowKeyword;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    /*
    Throw keyword has nothing to do with throws keyword.
    It does the opposite. It throws and exception manually.
    In order to create an Exception, you should use the class of the Exception and create an object from there.
    It will crash the program in specified conditions. Such as (throw exception) should be used instead of System.exit when terminating the
    program when conditions are not met
    Can be used only with classes that have 'IS A' relationship with THROWABLE


     */

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            if (age < 0) {
                throw new InputMismatchException("The age should not be negative.Given: " + age);
            } else {
                throw new InputMismatchException("The age cannot be greater than 150. Given: " + age);
            }
        }
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("-----------------------------");
        //throw new RuntimeException("Runtime Exception");// nothing will be executed afterwords
        //System.out.println("Error");// will never be executed

        throw new FileNotFoundException("");// checked exception occurs right away, that's why no need for throw exception
    }
 }

