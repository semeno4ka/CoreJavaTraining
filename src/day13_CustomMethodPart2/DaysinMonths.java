package day13_CustomMethodPart2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DaysinMonths {
    public static void main(String[] args) {
        int month = new Scanner(System.in).nextInt();// we did not asssign the input, because we are not going to use it for more than once.
        //That's the way we do it

        if(month<1 && month>12){// if the month is invalid, the main method will be terminated
            System.err.println("Invalid month number");
            return;
        }

        switch(month){// of not the condition above, 1~12 are valid then implicitly
            case 2:
                System.out.println("28 days");;break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days"); break;
            default:
                System.out.println("31 days");break;
        }


    }
}
