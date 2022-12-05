package day10_Scanner_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LongStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string");
        String first = input.nextLine();
        System.out.println("Enter the second string");
        String second = input.nextLine();

        int length1 = first.length();
        int length2 = second.length();// can skip this part, implying the length right at the condition ->
        //if(first.length()>second.length)!!!!!

        if (length1 > length2) {
            System.out.println("The longest string is " + first);
        } else if (length2 > length1) {
            System.out.println("The longest string is " + second);
        } else {
            System.out.println("Equal");
        }
        input.close();
    }
}
/*
            1.1 Ask the user to enter two strings
            1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"
 */
