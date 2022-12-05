package day14_ForLoop;
//REVIEWED
public class MethodOverloadingPractise {

    public static int sum(int num1, int num2){
       return(num1+num2);
    }

    public static int sum(int num1, int num2, int num3){
        return(sum(num1,num2))+num3;
    }

    public static int sum(int num1, int num2, int num3, int num4){
        return(sum(num1,num2,num3))+num4;
    }


}
