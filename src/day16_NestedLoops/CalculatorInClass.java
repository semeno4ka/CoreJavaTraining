package day16_NestedLoops;

import java.util.Scanner;

public class CalculatorInClass {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String answer="yes";

        while(answer.equals("yes")) {


            System.out.println("Enter first number");
            double num1 = input.nextDouble();

            System.out.println("Enter math operator");
            char op = input.next().charAt(0);

            while (!(op == '+' || op == '-' || op == '*' || op == '/')) {// while invalid, keep asking
                System.out.println("Invalid operator. Please, re-enter");
                op = input.next().charAt(0);
            }

            System.out.println("Enter you second number");
            double num2 = input.nextDouble();
              // CHANGE TO TERNARY
            double result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                default:
                    result = num1 / num2;
                    break;
            }

            System.out.println(result);

            System.out.println("Would you like to continue?Yes/No");
            answer=input.next().toLowerCase();
            while(!(answer.equals("yes")|| answer.equals("no"))){
                System.out.println("Invalid answer. Please, re-enter");
                answer=input.next().toLowerCase();
            }
        }

    }
}
