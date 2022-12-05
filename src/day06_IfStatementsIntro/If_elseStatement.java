package day06_IfStatementsIntro;

public class If_elseStatement {
    public static void main(String[] args) {

        //IF ElSE when there are TWO possible scenarios (yes/no or true/false) Can't be less or more than 2
        // if (condition) {statement} else {statements}
        int age = 28;
        if (age >=21) {
            System.out.println("Eligible");//pay attention that semicolon is still here
        }else{//otherwise
            System.out.println("Not eligible");
        }// else means if it returns FALSE, then execute the following

    }
}
