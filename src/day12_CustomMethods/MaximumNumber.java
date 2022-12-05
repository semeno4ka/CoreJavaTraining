package day12_CustomMethods;

public class MaximumNumber {
    public static void main(String[] args) {
        maxNum(3,3);
    }

    public static void maxNum(int num1, int num2){
        if(num1>num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num1<num2){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }
    }


}
