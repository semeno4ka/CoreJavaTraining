package day08_ternary_switch;

public class TernaryThree {
    public static void main(String[] args) {
        //Better to apply ternary to if and else statements, not nested if. You can combine though
        int score = 130 ;
        /*String result="";//can skip initializing in the beginning and keep it String result;
        if(score>=0 && score<=100){
            if(score>=60){
                result="Passed";
            }else{
                result="Failed";
            }
        }else{
            result="invalid";
        }
        System.out.println(result);
    */
        String result=(score>=0 && score<=100)?//pre-conditio
                (score>=60)? "Passed":"Failed"//sub condition when the pre-condition is met
                :"Invalid"; //opposite of precondition
        System.out.println(result);
        System.out.println("_____________________");

        int n = 7;
        String day=(n>=1 && n<=7)?
                (n==1)? "Monday":(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday"
                        :(n==5)?"Friday" :(n==6)?"Saturday":"Sunday"
                : "Invalid day number";
        System.out.println(day);

    }
}
