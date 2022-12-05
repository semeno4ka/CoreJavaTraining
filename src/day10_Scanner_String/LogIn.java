package day10_Scanner_String;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName="Cydeo";
        String password="WoodenSpoon";

        System.out.println("Enter your username");
        String userName1=input.nextLine();
        System.out.println("Enter your password");
        String password1=input.nextLine();// you assign a string variable to keep it in the memory for later comparison

        if(userName.equals(userName1) && password.equals(password1)){ // we use equal scenario instead of == because by default users input is created
            //as new input and is stored outside the String pool and the username variable we created is store in String pool""(thus objects are different)
            System.out.println("You are logged in");
        }else{
            System.err.println("Incorrect username or password. Please try again");
        }
input.close();
    }
}
/*
2.1 Ask the user to enter the username & password
            2.2 print "You are not logged in" If user entered valid username and password
                otherwise print the error message "Incorrect username or password. Please try again"

            Note: Assume that the valid credentials are:
                        username: Cydeo
                        password: WoodenSpoon
 */
