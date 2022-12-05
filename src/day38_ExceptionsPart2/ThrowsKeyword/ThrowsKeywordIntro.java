package day38_ExceptionsPart2.ThrowsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordIntro {
    /*
    - checked exception ONLY
    - used within the method signature
    - inform compiler that one of the listed exception types will be thrown
    - the fastest way to get rid of compile error that's cause by a checked exception
    - doesn't actually handle an exception, just solves it temporarily
    - eventually the exception will come back every ti,e method is called
    - if you are not going to use the method as Utility class(call it somewhere else) you can use throw, since it fast. If the method is called
      elsewhere,you will always get compile error

      If you have many checked exceptions, you can use 'throws Exception' parent class to cover all or use multiple classes
      If you use several classes, child classes should go first
     */
    public static void main(String[] args) throws InterruptedException{
/*
        System.out.println("Program1 started");
       // System.out.println(100/0); unchecked
        try{
            Thread.sleep(5000); //checked exception
        }catch(InterruptedException e){
            e.printStackTrace();
        } // try catch will handle this problem permanently
        System.out.println("Program1 ended");// will not be printed until the exception is handled
        //throws keyword cannot handle unchecked exc exception

        System.out.println("Program2 started");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program2 ended");*/

        System.out.println("Program1 started");

            Thread.sleep(5000); //checked exception

        System.out.println("Program1 ended");
        System.out.println("-----------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(5000); //checked exception

        System.out.println("Program2 ended");

        System.out.println("-----------------------------------");
        System.out.println("Program3 started");

        Thread.sleep(5000); //checked exception

        System.out.println("Program3 ended");


    }
}
