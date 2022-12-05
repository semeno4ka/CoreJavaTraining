package day09Switch_and_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        String outcome = "";

       outcome= (num%2==0)?"Even Number":"Odd Number";

        System.out.println("You entered " + outcome);
        input.close();
    }
}
