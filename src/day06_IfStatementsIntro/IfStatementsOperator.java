package day06_IfStatementsIntro;

public class IfStatementsOperator {

    public static void main(String[] args) {
        // SINGLE IF
        // if ( condition is true ) then { statement gets executed }
        // Can be used to ONE POSSIBLE output ONLY

        int number = 100;
        // if the number is greater than 0(true), then "is positive" will be printer. If false, nothing will be printed
        boolean isPositive = number > 0;
        boolean isZero = number == 0;
        boolean isNegative = number < 0;


        if ( isPositive ) {
            System.out.println(number + " is positive number");
        }
        if (isZero) {

            System.out.println(number + " is zero");
        }
        if (isNegative) {
            System.out.println(number + " is negative");
        }

    }
}
