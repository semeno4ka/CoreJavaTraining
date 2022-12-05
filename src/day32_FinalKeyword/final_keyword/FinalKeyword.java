package day32_FinalKeyword.final_keyword;

import java.time.LocalDate;

class CydeoStudent{ // if I place final, it cannot become a parent
    public final void language(){// child class can inherit, but cannot change
        System.out.println("Java Programming");
    }
}
public class FinalKeyword extends CydeoStudent {
    /*
    public void language() {
        System.out.println("Python Programming");
    }
    ---------------------------------- THEORY--------------------------------------------------
     */
    /*
    Applicable for variable(static, instance, local), method(prevents method overriding) or class
    Used to restrict the user
    Once applied to value, the value cannot be changed
    Makes features unchangeable, immutable, cannot be reassigned, overridden

    CANNOT BE applied to Constructor and Abstract class

    You should apply final to all final values, such as PI(3.14). If you do not apply it, it can be changed

    Can be applied one time only

    Static- one copy, but the value can be changed. With final, the value is unchangeable.

    No need final keyword for static methods, because static methods cannot be overridden anyway
    Final keyword should be placed before return type

    Constructor cannot be final, that's a special method for creating Objects

    Other than that, every method can be overloaded even if it is final

   Final Class cannot be extended!
   Cannot become a parent/super. Prevents inheritance. But final class still can be a child

   If the variable is final. only getter can be generated( because the setter is used after the object is created, if it is created, and it is final it cannot be changed)

     */

    public FinalKeyword() {
        // nothing can be added to constructor except for parameters.
    }

    public static void main(String[] args) {// no point to give final to any static method
        //   CHANGEABLE
        char gender = 'M'; // local variable within main method
        System.out.println(gender);// male
        gender = 'F';
        System.out.println(gender);// female

        // UNCHANGEABLE
        final char genderUnchangeable= 'X'; // will always remain X
        System.out.println(genderUnchangeable);

        System.out.println("--------------EXAMPLES--------------------");
        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);// 07/01/2022

        //dateOfBirth= dateOfBirth.plusYears(1); cannot be changed
        System.out.println(dateOfBirth);//07/01/2023

        System.out.println("--------------EXAMPLES--------------------");
        new CydeoStudent().language();// Java Programming
        new FinalKeyword().language();// returns Python Programming

        System.out.println("--------------EXAMPLES--------------------");
        String name = "James";
        // to make it eligible for garbage collection: un-reference the object or assign it to null
        //name=null;
        name ="Daniel"; //James went to garbage collection
        //To prevent from garbage collection, you can make the value final

        //Mutable version of char sequence is Stringbuilder???


    }
}
