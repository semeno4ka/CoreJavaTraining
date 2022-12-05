package day19_Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to input?");
        int total = input.nextInt();   // the answer is the size of our array

        int[] number = new int[total];
        int sum = 0;


        for (int i = 0; i <total ; i++) {

            System.out.println("Enter a number");
            number[i]=input.nextInt(); // each input will be assigned to an index number of Array Object
            sum+=number[i];
        }
        double average = sum/(double)total;// pay attention to different data type and where you place a new variable!!
        //If you need to round the result without changing data you use decimal format

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(Arrays.toString(number));
        System.out.println("sum:" + sum);
        System.out.println("average: "+df.format(average));
    }
}
