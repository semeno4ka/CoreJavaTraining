package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;

public class LunchTask {
    public static void main(String[] args) {
        DateTimeFormatter task = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime taskDay = LocalDateTime.of(2020, 11, 24, 13, 0);
        System.out.println(taskDay.format(task));

        String[] classmates = {"Ivan", "Gregory", "Mark", "Martin", "Kevin"};
        LocalDate[] dob = {LocalDate.of(1997, 10, 5), LocalDate.of(1987, 11, 20), LocalDate.of(1996, 8, 12),
                LocalDate.of(1993, 7, 24), LocalDate.of(1986, 6, 15)};
        boolean isLeap=true;
        LocalDate youngest = Collections.max(Arrays.asList(dob));
        //int nameIndex=0;
        for (int i = 0; i < dob.length; i++) {
            if (dob[i].isLeapYear()){
                //nameIndex=i;
                System.out.println(classmates[i]+" was born in a Leap Year");
            }
            if (dob[i] == youngest) {
               // nameIndex=i;
                System.out.println(classmates[i]+" is the youngest among all");
            }
        }



    }
}


/*
create string array to have 5 of your classmate's names

    2. create an array that contains their date of birth

    3. find out who is the youngest person //String? convert to int?OR jus

    4. find out who was born on leap year
 */