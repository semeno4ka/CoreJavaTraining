package day37_Exceptions.ExceptionIntro;

import day18_GarbageCollection.Pizza;

import java.io.FileInputStream;

public class PracticeExceptions {
    public static void main(String[] args) {

        //Unchecked exception

        String str = "Java";
       // char ch = str.charAt(250);// no error occurred, yet will throw an exception later, since index out of bound
        //System.out.println(ch);
       Pizza pizza= null;// null is null, it doesn't exist - unchecked exception
       // pizza.calcCost();//unchecked exception
        System.out.println(50/0);//division by 0 iz not allowed - unchecked exception


      // FileInputStream file = new FileInputStream("");// checked exception
      //  Thread.sleep(3000); //checked exception


    }
}
