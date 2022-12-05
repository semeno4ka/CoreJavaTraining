package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        /*
        hours, minutes, seconds, nanoseconds
        java.time.LocalTime;
        now() returns LocalTime object with current time

         */

        LocalTime starting_time= LocalTime.of(9,30);// you can choose what parameters to show
        System.out.println(starting_time);
        LocalTime currenTime= LocalTime.now();
        System.out.println(currenTime);// depends on your Laptop time setting

        System.out.println("      PRACTISE WITH METHODS       "); // accepts 23 for hours and 59 for minutes,seconds, because otherwise its another minute and day
        LocalTime time1 = LocalTime.of(23,59,59);
        System.out.println(time1);
        LocalTime time2=time1.plusHours(3);
        System.out.println(time2);
        time1=time1.minusMinutes(47);
        System.out.println(time1);
    }
}
