package day08_ternary_switch;

public class Calculator {
    public static void main(String[] args) {
        /*double n1 = 0.5, n2 = 1.7;
        char mathOperator = '>';
        double result = 0;
        if (mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/') {
            switch (mathOperator) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    result = n1 / n2;
                    break;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid Operation");
        }
    }
}*/

            System.out.println("--------------------");
            double num1=0.5, num2=1.7;
            String outcome="";
            char mathOp='+';
            switch (mathOp) {
                case '+':
                    outcome+=num1 + num2;
                    break;
                case '-':
                    outcome+=num1 - num2;
                    break;
                case '*':
                    outcome+=num1 * num2;
                    break;
                case '/':
                    outcome+=num1 / num2;
                    break;
                default: outcome="Invalid Operation";break;
            }
            System.out.println(outcome);
        }
    }


/*
Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement
 */