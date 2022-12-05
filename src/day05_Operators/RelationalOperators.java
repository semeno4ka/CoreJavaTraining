package day05_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        //Greater than
        int a = 100;
        int b = 200;
        System.out.println( a > b);
        // I can use it as an operator using boolean
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);

        int score = 58;
        boolean passed = score > 60;// bug, since 60 should count as passed (>=)
        System.out.println(passed);

        //Greater than (OR,EITHER ONE)
        int age = 18;
        boolean eligable = age >= 21;
        System.out.println(eligable);

        boolean eligibleToVote = age >= 18;
        System.out.println(age);

        //Less than

        score = 48;
        boolean failed = score < 60; // 60 still passed, 59 failed
        System.out.println( 1000 < 10000); //false

        //Less than (either or)
        System.out.println(95 <= 100); //true
        System.out.println(100 <= 100); // true

        // Can I apply it to CHAR?Yes, because char character has its own number
        System.out.println('a' >= 'b'); //false
                           // 65   66









    }
}
