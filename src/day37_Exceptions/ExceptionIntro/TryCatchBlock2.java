package day37_Exceptions.ExceptionIntro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock2 {

    public static void main(String[] args) {
        System.out.println("First Example");
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[1000]);
        }catch(RuntimeException e){
            //not required to place anything, but this way we will not know what was the exception
            e.printStackTrace();// displays full details of the exception after the program gets executed
        }
        System.out.println("Program1 ended");
        System.out.println("--------------------------------------------");
        System.out.println("Program2 started");
try{
    System.out.println(9/0);
}catch(RuntimeException e){
    //e.printStackTrace();
    System.out.println(e.getMessage());// returns String
}
        System.out.println("Program2 ended");
        System.out.println("--------------------------------------------");
        System.out.println("Program3 started");
        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Program3 ended");
    }
}
