package day07_IfSTatements;

public class NestedIf_Statement {
    public static void main(String[] args) {
        /*         NESTED - one thing inside another. One statement inside another statement
        There has to be pre-condition in order to use Nested_If. Pre-condition- smth needs to be done before checking other conditions

        if(condition){
        if()condition)
        {
        statement}
        }
        */
        int score = 95;//need to determine a pre-condition: score needs to be valid
        if (score >= 0 && score <= 100) {// if the score is valid
            if (score >= 60) {// if the score is >=60
                System.out.println("Student passed");
            } else {//the score is less than 60
                System.out.println("Student failed");
            }
        } else {// if the score is not valid number
            System.out.println("Invalid score");
        }// THE IDEA IS TO AVOID CHECKING ALL THE CONDITIONS

        int age = 170;//1~150 years old
        if (age >= 1 && age <= 150) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        }else {
            System.out.println("Invalid age");
        }



        //Why Nested required and this one is wrong? -->
        //Every single condition will be checked first, nut our goal is to skip checking unnecessary conditions
        int day = 5;
        /*
        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3) {
            System.out.println("Wednesday");
        }else if(day==4) {
            System.out.println("Thursday");
        }else if(day==5) {
            System.out.println("Friday");
        }else if(day==6) {
            System.out.println("Saturday");
        }else if (day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid");
        }
        */
        //FIRST we need to establish which numbers are valid, which are not
        if(day>=1 && day<=7){ //if pre-condition is met // THIS SOLUTION DOES NOT CHECK UNNECESSARY CONDITIONS. It is FASTER
            if(day==1){
                System.out.println("Monday");
            }else if(day==2){
                System.out.println("Tuesday");
            }else if(day==3) {
                System.out.println("Wednesday");
            }else if(day==4) {
                System.out.println("Thursday");
            }else if(day==5) {
                System.out.println("Friday");
            }else if(day==6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }
        }else{// if the pre-condition failed
            System.out.println("Invalid day number");
        }

    }
}
