package day09Switch_and_Scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);// if you use data and plan to store variables
        System.out.println("Enter the day number:");
        int num = new Scanner(System.in).nextInt();// if used just once and not stored as a variable
        // the input will then go to garbage
        String day = "Invalid";
        if(num >=1 && num <=7){
            day= (num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday":(num==5)?"Friday"
                    :(num==6)?"Saturday":"Sunday";
        }
        System.out.println(day);

        //input.close(); no need to close since I've used Scanner for a single input, not to store variables


    }
}
