package day09Switch_and_Scanner;

import java.util.Scanner;

public class NextLine_vs_Next {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=input.nextInt();// you hit Enter (\n) The program doesn't read Enter, only till the last number(45)
        input.nextLine();// enter key will go right to this input, no need to assign, since it won't be used ever again
        System.out.println("You entered your age: " + age);// Enter key will be left in Scanner's memory

        System.out.println("Enter your full name: ");// It by default put "enter" as your full name, since it went to Scanner's memory
        String name=input.nextLine();// you are not able to enter anything on this step
        //To resolve it, you should make sure the Scanner's memory is empty. you have to add Extra nextLine!!!!!!!
        System.out.println("Your full name is : "+ name);


    }
}
