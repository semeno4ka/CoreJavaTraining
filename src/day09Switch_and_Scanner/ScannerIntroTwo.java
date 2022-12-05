package day09Switch_and_Scanner;

import java.util.Scanner;

public class ScannerIntroTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number:");
        float num1= input.nextFloat();// can provide int which will be converted into decimal as the output

        System.out.println("Enter your second decimal number:");
        double num2 =input.nextDouble();

        //boolean
        System.out.println("Enter true or false:");
        boolean r =input.nextBoolean();// should be either true or false

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("r = "+ r);
        input.close();




    }
}
