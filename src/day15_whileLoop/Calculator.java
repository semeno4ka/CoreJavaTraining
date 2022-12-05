package day15_whileLoop;
//REVIEWED
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number:");
        double num1 = input.nextDouble();
        System.out.println("Enter your second number:");
        double num2 = input.nextDouble();
        System.out.println("Enter math operator:");
        char operator=input.next().charAt(0); // !!!!!! how to call a char
        //boolean validOperator= (operator=='+'|| operator=='-'|| operator=='*'|| operator=='/');
        // BOOLEAN HAS TO BE REASSIGNED AFTER EVERY ENTRY
        double result;
        while(!((operator=='+'|| operator=='-'|| operator=='*'|| operator=='/'))){//while operator is invalid
            System.err.println("Invalid Operator. Please, re-entry");
            System.err.println("Enter math operator:");
            operator=input.next().charAt(0);
        }
        //can do if statement as well
        switch(operator){
            case '+':result=num1+num2; break;
            case '-':result=num1-num2; break;
            case '*': result=num1*num2;break;
            default: result=num1/num2;break;
        }
        System.out.println(result);
    }
}
