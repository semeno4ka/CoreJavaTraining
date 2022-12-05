package day15_whileLoop;
//REVIEWED
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid age should be between 1 - 120

        while(!(age>=1 && age<=120)){// the best way to give invalid condition is to use logical ! not next to valid

            System.err.println("Invalid entry! Please, re-enter the age:");
            age=input.nextInt();// while the age is not valid, keep asking for re-entry
        } // if the age was valid in the beginning, the while loop will not start, since the condition is false

        System.out.println("Are you a US citizen? Yes/No");//to Ignore Case Sensitivity, convert input to lowercase right away
        String yesOrNo=input.next().toLowerCase();

        while(! (yesOrNo.equals("yes") || yesOrNo.equals("no"))){// while the answer is Neither yes or no

            System.err.println("Invalid entry! Please, re-enter:");
            System.err.println("Are you a US citizen? Yes/No");
            yesOrNo=input.next().toLowerCase();
        }
       if(age>=21 && yesOrNo.equals("yes")){
           System.out.println("You are eligible to vote");
       }else{
           System.out.println("You are not eligible to vote");
       }
       input.close();







    }
}
