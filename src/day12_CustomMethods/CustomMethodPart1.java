package day12_CustomMethods;

import java.util.jar.JarOutputStream;

public class CustomMethodPart1 {

     public static void main(String[] args){
         //your custom method should not be within another method.
         greetings();// in order to be executed, you should call it inside main method
         System.out.println("___________");
         displayMessage();

     }

         //start creating Method underneath main method. MINIMIZE after method is created
    public static void greetings() {// can be placed before the main method, the idea is that you cannot put method inside a method
        System.out.println("Hello, Cydeo!");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java?");
    } //you have to check that you've closed curly braces for this method
    public static void displayMessage(){
        System.out.println("Hello, world!");
        System.out.println("I love Java!");
    }//if no information needed to be added, the () will stay empty
    //OTHERWISE, we will use the parameter()the value you place inside () without the parameter the method will never be completed

    public static void eligible(){//should decide what data type we need for the parameter. Can be any data type.
         // The value for the parameter MUST be provided. it's called - ARGUMENT. could be a value or a variable



    }





    }//method CANNOT BE created OUTSIDE class
