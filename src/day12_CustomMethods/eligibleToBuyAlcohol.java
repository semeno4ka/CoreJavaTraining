package day12_CustomMethods;

import org.w3c.dom.ls.LSOutput;

public class eligibleToBuyAlcohol {
    public static void main(String[] args) {
 ;
        eligibility(32);// you don't have to assign it to variable if you are not going to use it later

    }


    public static void eligibility(int age){
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }



}

