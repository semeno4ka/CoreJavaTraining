package day12_CustomMethods;

public class Grade {
    public static void main(String[] args) {
     grade(67);


    }
    public static void grade(int grade){
        if(grade>=90){
            System.out.println("Excellent");
        }else if(grade>=80 && grade<90){
            System.out.println("Great job");
        }else if(grade>=70 && grade<80){
            System.out.println("Good");
        }else if(grade>=60 && grade<70){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        }
    }

