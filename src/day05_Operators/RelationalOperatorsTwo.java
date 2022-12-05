package day05_Operators;

public class RelationalOperatorsTwo {

    public static void main(String[] args) {

        // EQUAL ==
        System.out.println(100 == 101);//false
        System.out.println("Java" == "Java");//true
        // Will == string can also be compared with this Operator
        System.out.println("Java" == "java");//false
        // Lower case and Upper case are different in Java
        System.out.println("Muhtar" == "Good guy");// false
        System.out.println(true == false);//false


        //NOT EQUAL !=
        System.out.println(1000 != 2000);// true
        System.out.println("Java" != "java"); // true
        System.out.println("Java" != "Java");// false
        System.out.println("Muhtar" != "Good guy"); //true
        System.out.println(100 != 101);// true
        System.out.println(true != false);//true

    }
}
