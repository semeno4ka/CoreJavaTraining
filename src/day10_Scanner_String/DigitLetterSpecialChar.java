package day10_Scanner_String;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // if you want to use scanner just once without memorizing it, then
        // String word = new Scanner(System.in).nextLine();


        //BETTER TO CHECK IF THE STRING IS OR IS NOT EMPTY!!!!
        System.out.println("Please, enter a word");
        String word=input.next();
// TRY TO REWRITE WITH A SWITCH!!
        char upCase = word.charAt(0);
        char lowCase = word.charAt(0);
        char dig = word.charAt(0);
        if(upCase>=65 && upCase<=90){
            System.out.println("first character is uppercase letter");
        }else if(lowCase>=97 && lowCase<=122){
            System.out.println("first character is lowercase letter");
        }else if(dig>=49 && dig<=57){
            System.out.println("first character is digit");
        }else{
            System.out.println("first character is special character");
        }input.close();
    }
    /* BETTER TO CHECK IF THE STRING IS OR IS NOT EMPTY!!!!
    STRING STR = " ";
    If (str.length() >=1) means ig the string has at least one character then else "Empty string
     */
}
/*
DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
            - if the word starts with digits, print "first character is digit"
            - if the word starts with uppercase letters, print "first character is lowercase letter"
            - if the word starts with lowercase letters, print "first character is uppercase letter"
            - if the word starts with special characters, print "first character is special character"


            HINT: You need to check the ascii table
 */