package day04_Concatenations;

import java.sql.SQLOutput;

public class Arithmetic_calculations {
    public static void main(String[] args) {

        //Addition
        System.out.println(1000 + 2000);
        System.out.println(2.5 + 7.5); // the result will always return a decimal

        //Subtraction
        System.out.println(1350 - 730);
        // in order or use the output of this operation in the future, you can assign it to int type
        int a = 1350 - 730;
        System.out.println(a);

        //Multiplication
        System.out.println(6*180);
        System.out.println(2.6*4.3);

        //DIVISION
        // Division is different from math, because whenever the result of a division is not a whole number, it will return an integer
        System.out.println(10/3);// will return 3, even though the output should be 3.33
        //In order to get a result as decimal, you should put ".0" or "d"/"D" to one or both of the number
        System.out.println(10.0/3); // thus the result will be 3.33
        //You can also CAST the results the other way around if you need to round up decimals output
        System.out.println( (int) (2.5/0.5) );// thus the result will be integer, not decimal (5 not 5.0)

        //REMAINDER
        System.out.println(10%4);



    }
}
