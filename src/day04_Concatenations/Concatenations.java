package day04_Concatenations;

public class Concatenations {
        public static void main(String[] args) {
            String name = "Nora";
            int age = 17;
            int salary = 85000;// you are allowed to use _ to make the numbers more readable
            System.out.println("Hello, "+ name);
            System.out.println("You are "+ age + " years old.");// keep the space between the last and first words of teh string
            System.out.println("Your salary is " + salary + "USD.");

            //Whatever you put after "", it will be considered a String, if it is not a variable
            System.out.println(3 + 2 + " " + 4 + 5); //the outcome is 5 45, not 5 9
        }
    }
/*
----------String Concatenation
-the action of linking things together by using + operator.
-the only condition: there should be at list one string on either side of a statement
- System.out.println("This is " + "one string"); will return as one string  "this is one string"
  int num = 5;
  System.out.println("The value is "+ num); will return as The value is 5.
- it is COMBINING, not adding




 */