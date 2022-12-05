package day09Switch_and_Scanner;

import java.util.Scanner;

public class ScannerIntroThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //STRING AND CHAR VIA STRING ONLY
        System.out.println("Would you like to continue?");
        String answer = input.next();// can't accept more than one word
        System.out.println("You have entered: "+ answer);

        System.out.println("Enter a character:");
        //char ch=input.next(); can't be assigned like that
        char ch=input.next().charAt(0);
        System.out.println("You have entered character:"+ ch);

        System.out.println("Are you sure you want to continue?");
        String answer2 = input.nextLine();//if you use nextLine after other scanner inputs, you won't be able to answer
        System.out.println("Your answer is : "+ answer2);

        input.close();











    }
}
