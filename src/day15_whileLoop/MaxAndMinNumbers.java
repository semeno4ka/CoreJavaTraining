package day15_whileLoop;
//REVIEWED
import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max=-2147483648;//whatever the input, it will be greater, thus reassigned
        int min=2147483647;//whatever the input, it will be less, thus reassigned

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num=input.nextInt();

            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("Minimum number is: "+ min+ ", maximum number is: "+max);

    }
}
