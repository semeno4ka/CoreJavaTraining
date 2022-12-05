package day15_whileLoop;
//REVIEWED
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min=2147483647;   //we assign the largest integer in Java


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number:");
            int num=input.nextInt();
            if(num<min){
                min=num;
            }
            System.out.println("min number is: "+ min);
        }
    }
}
