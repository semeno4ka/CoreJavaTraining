package day16_NestedLoops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }

            System.out.println("Would you like to enter another number?");
            String yesOrNo = input.next();
            while(!(yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("No"))) {
                // while the user provides invalid answer
                System.out.println("Invalid entry.Would you like to enter another number?");
                yesOrNo = input.next();
            }
            if(yesOrNo.equalsIgnoreCase("no")){
                break;
            }

        }


    }
}
