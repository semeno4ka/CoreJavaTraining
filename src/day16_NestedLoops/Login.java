package day16_NestedLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u,p;
        //if you need to give attempt
        int attempt=3;
        do{
            System.out.println("Enter your username");
            u=input.next();
            System.out.println("Enter password");
            p=input.next();

            attempt--; //(will be decreasing attempts each time
            if(attempt ==0){
                break;
            }

        }while(!(u.equals("Cydeo")&& p.equals("WoodenSpoon")));// while invalid, keep asking
        //when valid, exits
    }
}
