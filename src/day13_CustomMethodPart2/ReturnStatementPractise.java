package day13_CustomMethodPart2;

import day17.Employee;

import java.util.Scanner;
public class ReturnStatementPractise {
    public static void main(String[] args) {

       char grade = new Scanner(System.in).next().charAt(0);// to get char character from scanner
       // we can give a condition to terminate the switch if grade is invalid
        boolean isValid= grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F'; // if the grade is not valid, it will terminate
        if(!isValid){// if grade is valid, thenit will execute the rest of teh code
            System.err.println("Invalid grade");
            return;
        }
        System.out.println((grade=='A')?"Excellent":(grade=='B')?"Great job":(grade=='C')?"Good job":(grade=='D')?"Passed":"Failed");
       }

    }
