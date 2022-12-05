package day12_CustomMethods;

public class OddEvenZero {
    public static void main(String[] args) {
        oddEvenZero(7);


    }
    public static void oddEvenZero(int num){
        if(num%2==0){
            System.out.println("Number is even");
        }else if(num==0){
            System.out.println("Number is Zero");
        }else{
            System.out.println("Number is odd");
        }
    }

}
