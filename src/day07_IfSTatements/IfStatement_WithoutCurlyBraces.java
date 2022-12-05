package day07_IfSTatements;

public class IfStatement_WithoutCurlyBraces {
    public static void main(String[] args) {

        // ----------- USING CURLY BRACES IS ALWAYS BETTER FOR YOUR CODE, EFFICIENCY AND STRUCTURE----------

        int age = 32;
        if(age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }

        //Without curly brace if statement contains ONLY ONE statement byu default
        if(age >=21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        //Example JUST GOOD TO KNOW, DONT GET USED TO USING THIS
        int item1Number = 1;// if contains one statement can go without curly braces. If more than one statement curly braces are required
            if(item1Number==1)
        System.out.println("Eggs");
        else if(item1Number==2){
            System.out.println("Milk");
            System.out.println("Onion");
        }else{
            System.out.println("Apple");
            System.out.println("Cherry");
        }
        /*...*/ // If ther is ONE statement in If condition, then curly braces are optional
        int day = 2; //1~7
        if(day==1) System.out.println("Monday");
        else if(day==2) System.out.println("Tuesday");
        else if(day==3) System.out.println("Wednesday");
        else if(day==4) System.out.println("Thursday");
        else if(day==5) System.out.println("Friday");
        else if(day==6) System.out.println("Saturday");
        else System.out.println("Sunday");


    }
}
