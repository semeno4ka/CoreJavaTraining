package day09Switch_and_Scanner;
import java.util.Scanner; //can use both, but being specific is better, less memory usage
//import java.util.*;

public class ScannerIntro { // Scanner should be placed above the class and under package
    // import statement is used for importing one java file to another
    // regular import: (specify every single class you import) import.className
    // wild import:(imports everything from the package) *; this (*;) imports sign imports everything import java.util.*;
    public static void main(String[] args) {// in order to use Scanner ->
        Scanner keyboard = new Scanner(System.in);// makes connection with the keyboard

//Quick way to import scanner: type Scan+enter (after main method declared) the out input = new+ space

        Scanner input = new Scanner(System.in); //data type Scanner, value - new Scanner
        // specify the usage of scanner :input -in function/output - out function
        //System.in - for redding user input
        //input.close(); //disconnect the keyboard from this particular object in scanner

        //input.nextByte();// calling the required method

        System.out.println("Enter a number: ");
        byte num1=input.nextByte();// you assign it to byte or other data type if you plan to reuse this data


        System.out.println("Enter second number: ");
        short num2=input.nextShort();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter your fourth number: ");
        long num4=input.nextLong();
        System.out.println("Enter your fifth number: ");
        int num5 = (int)input.nextLong();// have to cast it manually

        input.close();// always close after finishing using the scanner. CLOSE RIGHT AFTER THE LAST SCANNER or in the end main method
        //input.reset() if need to reopen. or establish new scanner

        System.out.println("you entered: " + num1);
        System.out.println("you entered: " + num2);
        System.out.println("First number is : " + num1 + " second number is: " + num2);
        System.out.println("Your third number is: "+num3);
        System.out.println("You entered : "+num4);
        System.out.println("You entered fifth number : "+num5);

    }
}
