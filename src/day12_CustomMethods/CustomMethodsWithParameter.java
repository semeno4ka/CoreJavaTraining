package day12_CustomMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {
       int odd=oddOrEven(5);//here you assign the value the variable (Think of it as of a Scanner, and here you see users input which gets executed in oddOrEven method)
    }

     //the method varifies if the given number is Odd or Even(try to write short descriptions)
    public static int oddOrEven(int num) {//should decide what data type we need for the parameter. Can be any data type.
        // The value for the parameter MUST be provided. it's called - ARGUMENT. could be a value or a variable
       //no need to initialize int num=0; inside method, it is already in the argument
        if (num%2==0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
        return num;
    }
}
