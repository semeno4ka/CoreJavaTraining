package day07_IfSTatements;

public class GradeReport {
    public static void main(String[] args) {
         int score= 101;
         String grade =" You score is: ";// new way to print out with the result in the end

         if(score>=90 ){// if its false, then the score is already less than 90
             grade += "A";// condition less than 90 is given to the following statement by default
         }else if(score>=80){//if the first condition is false, then score>=80 will be enough BY DEFAULT no need to place && score,90
             grade += "B";
         }else if(score>=70){ // the score is less than 80 by default
             grade += "C";
         }else if(score>=60){// less than 70 by default
             grade += "D";
         }else{ grade += "F";}

        System.out.println(grade);// or you can print it all out in the end using concatenation
    }
}
