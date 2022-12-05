package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
        /*
        java.time.format.DateTimeFormatter;
        DateTimeFormatter df; df-dateTime formatter
        df = DateTimeFormatter.ofPattern()// formatter is passed as a Sting by the use of Key characters in desired Order

        y: Year of Era        y: 4-digits year          yy: 2-digit year number
        M: Month of year      M: months number          MM: months number including 0
                              MMM: months abbr(Jan)     MMMM: month full name
        d: Day of month       d: day number             dd: day number including 0
        E: day of week        E: day name full          EEE day name abbr(Mon)

        H: Hour 24 format     H: 24                     HH: 24 including 0
        h: Clock hour         h: 12 hours               hh: 12 hour including 0
        m: Minute             m: minute                 mm: minute including 0
        s:Second              s: Second                 ss: second including 0
        S: nanosecond
        a: am/pm

         */

        // SET DESIRED FORMAT IN THE FIRST PLACE TO REUSE IT
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEE,MMM.dd.y"); // Fri,Jun.17.2022
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df)); // default:2022-06-17   formatted: whatever you put into formatter instance variable

        LocalDate date1=LocalDate.of(2022,7,6);
        System.out.println(date1.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1 = LocalTime.of(23,5);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a EEE,MMM.dd.y"); // only the characters of parameter CAN be included
        LocalDateTime today2 = LocalDateTime.now();
        System.out.println(today2.format(dtf));

        DateTimeFormatter task=DateTimeFormatter.ofPattern("E, h:mm a, MMM/dd/y");
        LocalDateTime taskDay = LocalDateTime.of(2020,11,24,13,5);
        System.out.println(taskDay.format(task));

    }
}
