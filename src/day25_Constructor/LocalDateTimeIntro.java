package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {
        /*
        LocalDateTIme a combination of LocalDate and LocalTime
        java.time.LocalDateTIme;
        years,months,days,hours,minutes,seconds,nanoseconds

        Has all the methods of LocalDate and all the methods of LocalTime

        LocalDateTIme=LocalDate+LocalTime;
        now() returns and objects with current date and time
        of() returns an object with specific date and time
         */
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);
        LocalDateTime ends = LocalDateTime.of(2023,5,25,11,0);
        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());
    }
}
