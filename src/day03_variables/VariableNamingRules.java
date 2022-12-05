package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {
        //age of the student is 28
        int age = 28;
        int x = 28; // you won't get compile error, yet it will be hard for you to remember what it stands for

        // salary is 100000
        int salary = 100000;
        int y = 100000; // hard to remember what you meant by "y"

        // variable name should be unique and cannot be shared with other variable
        //int age = 32; // will turn out an error, because "age" is already taken
        int age2 = 32;

        // = is assignment operator. it assigns data

        // if there is more than one word in variable name, you should apply CamelCase. preferred to start with Lower case
        int phoneNumber = 8572;
        System.out.println(phoneNumber);

        double salaryBeforeTax = 65450.3;

        double salary_After$Tax = 47560.7; // $ and _ are the only special characters that could be used in variable names

        /* Variable Naming Rules
        1. readable, understandable, meaningful
        2. must be unique, cannot be used for different variables
        3. camel case for long words
        4. no special characters except for $ and _ (underscore)
        5. cannot start with digits
        6. cannot have keywords that are reserved for Java language itself (public,static, void etc), could go as public1 though
        double class = 17; error
        double class01 = 17; not an error
        7. names should start with Lower case letters
         */




    }
}
