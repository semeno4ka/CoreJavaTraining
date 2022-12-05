package day19_Array;

import java.util.Arrays;

public class ArraysLiteral {
    public static void main(String[] args) {


        int[] number = new int[5]; //when you don't know which numbers exactly will be stored

        //     ARRAY LITERAL =>
        int[] numbers = {5,3,8,6,7};// when you know which element exactly you will store

        System.out.println(number.length);     //5
        System.out.println(numbers.length);    //5

        System.out.println("number= " + Arrays.toString(number));  //0,0,0,0,0
        System.out.println("numbers = " +Arrays.toString(numbers)); //5,3,8,6,7

        System.out.println("________________________________________________");


        //element         1        2         3            4          5         6        7
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index           0        1         2            3          4         5        6
        int n=1;
        System.out.println(days[n-1]);


        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int m=4;
        System.out.println(month[m-1]);

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.print(month[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < month.length; i++) {
            System.out.print(month[i]+" ");
        }

    }
}
