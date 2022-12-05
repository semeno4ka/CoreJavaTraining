package day06_IfStatementsIntro;

public class OperatorPrecedence {

    public static void main(String[] args) {

        // THE ORDER MATTERS AS MUCH AS IN MATH

        System.out.println(5 + 2 * 3); // math order * goes first
        System.out.println( 7 + 3 - 2 / 2 );// math order / goes first result 9

        System.out.println( - 5 + 3 );
        // negative should be executed first (-2)
        System.out.println(!true == false);
        // !(Not operator) gets executed first (false == false)

        System.out.println( 10 > 9 == 8 < 7          ||       "Java" == "Python"    &&      'a' == 'A');
        //              1 true (3 false)2 false     7 false        4 false         6 false      5 false
        //Pay attention that && comes before ||

        System.out.println( 100 >= 20 && 40*2 > 60);
        //                   100 >= 20   &&     80 > 60
        //                   2.true    4.true   3.true

       // int a = 20;
       // a + = 10 + 2 * 3; // 20+16= 36


    }
}
