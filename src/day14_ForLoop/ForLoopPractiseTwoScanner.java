package day14_ForLoop;
//REVIEWED
import java.util.Scanner;

public class ForLoopPractiseTwoScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //fori+enter will give you initial for loop

        /*for (int i = 0; i < 10; i++) {//i stand for initialization, that's why it come up by default
            System.out.println("Enter a number:");
            int num = input.nextInt(); //the question will be repeated along with input for 10 times
        }*/

        int sum=0;
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Enter a number:");
             sum+= input.nextInt();
        }
        System.out.println(sum);// the loop will get required answers and sum all of them


        //write a program that can ask user to enter 5 numbers for 5 times and display maxNumber

        //write a program that can ask user to enter 5 numbers for 5 times and display minNumber

    }
}
