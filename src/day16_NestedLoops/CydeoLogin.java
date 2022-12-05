package day16_NestedLoops;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the username");
        String userInput=input.next();

        System.out.println("Enter the password");
        String passInput=input.next();

        if(userInput.equalsIgnoreCase("Cydeo") && passInput.equalsIgnoreCase("WoodenSpoon")){
            System.out.println("Logged in.");
        }else{
            for (int i = 0; i < 3; i++) {//0,1,2,

                if(i!=2) {// for those which are not 2, it will print regular
                    System.out.println("Invalid entry.Please, re-enter");
                }else{// when is 2 it will give the last warning
                    System.out.println("This is your last attempt. Please re-enter your username and password");
                }
                System.out.println("Enter the username");
                userInput=input.next();

                System.out.println("Enter the password");
                passInput=input.next();
                //use breaking condition
                if(userInput.equalsIgnoreCase("Cydeo") && passInput.equalsIgnoreCase("WoodenSpoon")){
                    System.out.println("Logged in."); break;
            }
        }
            //goes after the loop. if loop terminates after three attempts
            //if is still within else block
            if(!(userInput.equalsIgnoreCase("Cydeo") && passInput.equalsIgnoreCase("WoodenSpoon"))){
                System.out.println("Your account is now locked. Please contact with the support team");
            }
        }
        input.close();

    }


    public static void cydeoLogin(String username, String password){
        if(username.equalsIgnoreCase("Cydeo")&& password.equalsIgnoreCase("WoodenSpoon")){
            System.out.println("Loggen in");
        }else{
            System.out.println("Invalid credentials");
        } // checks one time



    }


}
