package day05_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        //Logical AND && (BOTH conditions are met)
        double salary = 45000;
        int creditscore = 700;
        boolean eligibleForLoan = salary >= 30000 && creditscore >= 650;
        System.out.println(eligibleForLoan);

        //Can't change the variable salary and credit score. Because I have to write boolean again
        salary = 70000;
        creditscore = 540;
        eligibleForLoan = salary >= 30000 && creditscore >= 650;
        System.out.println(eligibleForLoan);

        // OR Logic (either one) ||
        int age = 32;
        String country = "USA";
        boolean eligibleToVote = age >= 18 || country == "China"; //returns True
        // for Vote we need BOTH Conditions, AND should be used, not OR
        System.out.println(eligibleToVote);
        //Compare to
        eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote);

        country = "Japan";
        boolean nativeEnglishSpeaker = country == "Canda" || country == "USA" || country == "UK" || country == "Australia";
        System.out.println(nativeEnglishSpeaker); //false
        country = "Australia";
        nativeEnglishSpeaker = country == "Canda" || country == "USA" || country == "UK" || country == "Australia";
        System.out.println(nativeEnglishSpeaker); //true
        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);

        String answer = "yes";
        boolean validanswer = answer == "yes" || answer == "no";//true
        System.out.println(validanswer);
        answer = "maybe";
        validanswer = answer == "yes" || answer == "no"; //false
        System.out.println(validanswer);

        char grade = 'A';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C'; //true
        System.out.println(passedTheExam);// can't work with && because having all grades at a time is not possible


        //Logical NOT !
        //apply at the beginning of the boolean to return the opposite of the result
        // We apply opposite operator to Boolean only (true or false operations)
        System.out.println(true); //true
        System.out.println(!true); //false
        String a = "yes";
        boolean yes = a == "yes";// true
        boolean no = !yes; // false
        System.out.println(yes);
        System.out.println(no);


        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);

        System.out.println( true == !false && false == ! true && true != !true); //true
                            //true       &&      true         &&    true








    }
}
