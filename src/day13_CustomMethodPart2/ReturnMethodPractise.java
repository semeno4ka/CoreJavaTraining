package day13_CustomMethodPart2;

public class ReturnMethodPractise {
    public static void main(String[] args) {


        System.out.println(isOdd(33));
        int num=200;
        if(isEven(num)){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+ " is odd number");
        }
    }


    public static int maxNum(int n1, int n2) {
        int maxNum = 0;    // return n1>n2? n1:n2         //if(n1>n2){return n1} return n2
        if (n1 > n2) {
            maxNum = n1;
        } else if (n1 == n2) {
            maxNum = n2;//either one
        } else {
            maxNum = n2;
        }
        return maxNum;
    }
    // if are the same, should return either one of them

    public static int minNum(int n1, int n2) {
        int minNum = 0;
        if (n1 < n2) {
            minNum = n1;
        } else if (n1 == n2) {
            minNum = n2;//either one
        } else {
            minNum = n2;
        }
        return minNum;
    }
    // if are the same, should return either one of them

    public static boolean isOdd(int n) {
        return(n%2!=0)?true:false;
    }

    public static boolean isEven(int n) {// ternaries are a good use in method creations
        return !isOdd(n);// if the number is not Odd number, then it is Even
    }
/*
if(n%2==0){
return true}
return false    // because only one gets executed- if it is not true, then false will be executed
 */
    }