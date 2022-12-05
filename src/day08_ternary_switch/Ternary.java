package day08_ternary_switch;

public class Ternary {
    public static void main(String[] args) {
         /*
    shorthand of IF..ELSE (two conditions, yet one result)
    !!!!Should be same type of value!!!
    Whatever is  returned can be assigned as a variable

    (condition)? value1 : value2;
    ? is If
    : else
    variable=(condition)? value1 : value2; Can be assigned to a value
     */
        int score = 85;
        String result="";
        if(score>=60){
            result="Passed";
        }else{
            result="Failed";
        }
        System.out.println(result);

        result=(score>=90)? "Passed" : "Failed";// You Have to ASSIGN it to a variable

        System.out.println(result);
        System.out.println("__________________________________");
        int age= 34;
        String r="";
        r=(age>=21)? "Eligible":"Not Eligible";
        System.out.println(r);

    }
}
