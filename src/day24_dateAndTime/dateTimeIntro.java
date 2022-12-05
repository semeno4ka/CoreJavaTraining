package day24_dateAndTime;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class dateTimeIntro {
    public static void main(String[] args) {
        /*
        Java has Classes for manipulation with date and time
        Date and Time Classes are Immutable
        import java.time; =>
        -LocalDate        -LocalTime     -LocalDateTime    -DateTimeFormatter

        LocalDate: years, months, days  => import java.time.LocalDate;

        now() returns LocalDate objects with current date
        LocalDate today =LocalDate.now();

        of() returns LocalDate object with specific years, months, days
        LocalDate birthday = LocalDate.of(1994,5,7);
         */
        System.out.println(LocalDate.now());
        LocalDate today = LocalDate.now();// can be assigned to variable
        System.out.println(today);

        LocalDate birthday = LocalDate.of(1990,10,17);
        System.out.println(birthday);

        System.out.println("     GET YEAR     ");
        System.out.println(today.getYear());// will return year
        System.out.println("     GET MONTH     ");
        System.out.println(today.getMonth()); // returns name
        System.out.println(today.getMonthValue());// returns number
        System.out.println("    DAY OF WEEK    ");
        System.out.println(today.getDayOfWeek());
        System.out.println("    DAY OF MONTH    ");
        System.out.println(today.getDayOfMonth());
        System.out.println("    DAY OF YEAR    ");
        System.out.println(today.getDayOfYear());

        System.out.println(birthday.getDayOfWeek());// what day of a week was the day I was born

        // CREATES NEW LOCAL DATE OBJECT. DO NOT CHANGE TODAY UNLESS YOU REASSIGN TODAY TO NEW OBJECT =>
        System.out.println("        PLUS YEAR     ");
        System.out.println(today.plusYears(1));//pass how many years plus
        System.out.println("        PLUS MONTH     ");
        System.out.println(today.plusMonths(3));
        System.out.println("        PLUS DAY     ");
        System.out.println(today.plusDays(7));
        System.out.println("        PLUS WEEKS      ");
        System.out.println(today.plusWeeks(4));
        System.out.println("        MINUS YEAR      ");
        System.out.println(today.minusYears(7));
        System.out.println("        MINUS MONTH     ");
        System.out.println(today.minusMonths(6));
        System.out.println("        MINUS DAY       ");
        System.out.println(today.minusDays(14));
        System.out.println("        MINUS WEEKS     ");
        System.out.println(today.minusWeeks(7));

        System.out.println("         EXAMPLES       ");

        LocalDate graduationDate = LocalDate.of(2025,6,4);
        System.out.println(graduationDate);
        graduationDate=graduationDate.plusYears(2);
        graduationDate=graduationDate.plusMonths(7);
        System.out.println(graduationDate);

        LocalDate yourBirthday = LocalDate.of(2005,4,1);
        System.out.println(yourBirthday);
        LocalDate brothersBirthday=yourBirthday.minusYears(2).minusMonths(3).plusDays(4);
        System.out.println(brothersBirthday);

        System.out.println("          IS BEFORE            ");
        LocalDate graduation = LocalDate.of(2023,1,1);
        System.out.println(graduation.isBefore(LocalDate.of(2022,12,31)));// false, since it's after
        System.out.println("           IS AFTER             ");
        System.out.println(graduation.isAfter(LocalDate.of(2022,12,31)));// true, since it's after
        System.out.println("           IS EQUAL         ");
        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1994,9,6);
        boolean oneDate=birthday1.isEqual(birthday2);// true if same date, false if different
        System.out.println("           IS LEAP          ");
        System.out.println(today.isLeapYear());// false
        System.out.println(LocalDate.of(2021,07,07).isLeapYear());//false
        System.out.println(birthday(2020,6,16));

    }

    public static String birthday( int year, int month, int day){
        String birthday="";
        int age = LocalDate.now().getYear()- LocalDate.of(year,month,day).getYear();
        if(LocalDate.of(year,month,day).getMonth()==LocalDate.now().getMonth() && LocalDate.of(year,month,day).getDayOfMonth()==LocalDate.now().getDayOfMonth() ) {
            birthday="Happy "+ age+ " Birthday!";
        }else{
            birthday="It's not your birthday. But congratulations for making it till "+age;
        }
        return birthday;
    }
}
