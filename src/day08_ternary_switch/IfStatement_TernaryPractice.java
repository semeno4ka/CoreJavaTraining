package day08_ternary_switch;

public class IfStatement_TernaryPractice {
    public static void main(String[] args) {//COMBINATION OF NESTED IF AND MULTI BRANCH TERNARY
        int score = 55;
        String result="";
        if(score>=0 && score<=100){
            result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }else{
            result="Invalid score";
        }
        System.out.println(result);
    }
}
