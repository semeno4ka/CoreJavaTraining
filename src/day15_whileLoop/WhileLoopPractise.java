package day15_whileLoop;
//REVIEWED
import java.util.Scanner;

public class WhileLoopPractise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=input.nextInt();

        while(!(age>=1 || age>150)){ // as long as age is not in valid range of the age, the question will be repeated
            System.out.println("Invalid entry! Please, re-enter your age");
            age=input.nextInt();
        }
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
input.close();
    }
}
