package day08_ternary_switch;

public class TernaryTwo {
    public static void main(String[] args) {
        // Converting Multi_branch into ternary

        int nu = 12;

       /* String result = "";
        if(num>0){
            result="Positive";
        }else if(num<0){
            result="Negative";
        }else{
            result="Zero";
        }
        */

        String result=(nu>0)?"Positive":(nu<0)? "Negative" : "Zaro"; //Pay attention to IF-> ELSE IF-> ELSE
        //the total number of IF should be even to the number of ELSE (number of ? should be same as :)
        System.out.println(result);

        System.out.println("____________________________");

        int n=1;

        String day=(n==1)?"Monday":(n==2)?"Tuesday": (n==3)?"Friday":(n==4)?"Thursday":(n==5)?"Friday"
                          :(n==6)?"Saturday":"Sunday";
        System.out.println(day);

        System.out.println("_________________________________");

        int numb = 12;//1~12
        String month =(numb==1)?"January":(numb==2)?"February":(numb==3)?"March":(numb==4)?"April":(numb==5)?"May":(numb==6)?"June"
                :(numb==7)?"July":(numb==8)?"August":(numb==9)?"September":(numb==10)?"October":(numb==11)?"November":"December";
        System.out.println(month);

    }
}
