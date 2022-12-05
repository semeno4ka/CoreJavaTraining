package day16_NestedLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Enter a number");// double
            double num1 = input.nextDouble();

            System.out.println("Enter a math operator");// reenter if invalid
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid operator. Please re-enter");
                operator = input.next().charAt(0);
            }

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                System.out.println("Enter your second number");
            }
            double num2 = input.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            System.out.println(result);

            System.out.println("Would you like to continue?");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer. Please, re-enter");
                answer = input.next().toLowerCase();
            }
        }
    }
}

