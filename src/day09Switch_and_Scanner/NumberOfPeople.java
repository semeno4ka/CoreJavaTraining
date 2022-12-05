package day09Switch_and_Scanner;

import java.util.Scanner;

public class NumberOfPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people=input.nextInt();
        String answer="";
        answer = (people < 3) ? "Live with less than 3 people"
                : (people >= 3 && people <= 6) ? "Live with 3 - 6 people" : "Live with more than 6 people";
        System.out.println(answer);
        input.close();
    }
}
/*
sk the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */