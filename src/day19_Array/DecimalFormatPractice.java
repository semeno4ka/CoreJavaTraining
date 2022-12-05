package day19_Array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {


        double n1 = 10.54873655;
        DecimalFormat df = new DecimalFormat("0.00"); // <= can choose how many figures go after '.' (0.00/0.000/0.0000)

        System.out.println(  df.format (n1));   //  <= pay attention to calling Decimal Class


    }
}
