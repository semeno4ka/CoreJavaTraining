package day15_whileLoop;
//REVIEWED
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max=-2147483648 ; // after first loop 10 becomes maximum, 2nd loop 10 stays max, 3rd stays 10, 4th time 20 become max, 5th time 20 stays the max
        // we declare variable for max number to contain it .
        // The smallest possible number from users input in java can accept for integer -2147483648 it will be compaired with actual users input
        // we take the smallest possible for int in java to cover the cases when user enters negative numbers
        for (int i = 0; i < 5 ; i++) {// goes from 0 to 5 including 0(should not include 5 then to print the statement 5 times).
            // it can go from 5 to 0, then i=5, i>=1 i--(since 5 is included, it will not cover 0)
            System.out.println("Enter a number:");
            int num=input.nextInt(); //10.5.3.20.15

            if(num>max){
                max=num;// if users input is greater than current max number, we reassign greater number to max variable
            }
        }
        System.out.println("max = "+ max);
    }
}
/*
Write a program that can ask the user to enter a number for 5 times and returns the maximum number
in order to return max number:


 */