package day13_CustomMethodPart2;
import java.util.Scanner;
public class ReturnStatementPractiseTwo {
    public static void main(String[] args) {


        int number = new Scanner(System.in).nextInt();
        if(number<1 && number>7){
            System.out.println("Invalid day number");
            return;//exit main method if the number is invalid
        }
        System.out.println( (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Saturday":"Sunday");


    }
}
