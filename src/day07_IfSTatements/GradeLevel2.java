package day07_IfSTatements;

public class GradeLevel2 {
    public static void main(String[] args) {
        int gradeLevel = 2;// precondition 1~18
        String result="";

        if(gradeLevel<=5){
            result= "Elementary School";
        }else if(gradeLevel<=8){// by default, it is already not in 1-5 range and will start from 6 by default
            result = "Middle School";
        }else if(gradeLevel<=12){
            result = "High School";//by default, it is already not in 1-5 and 6-8 range and will start from 9 by default
        }else if(gradeLevel<=16){
            result = "College";//by default, it is already not in 1-5,6-8,9-12 range and will start from 13 by default
        }else{
            result="Grad School";//by default, it is already not in 1-5,6-8,9-12,13-16 range and will start from 17 by default
        }
        System.out.println("The grade is: " + result);
    }
}
