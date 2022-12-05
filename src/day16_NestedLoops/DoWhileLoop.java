package day16_NestedLoops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //statement gets executed first, then the condition is checked and from there it decided whether to go further or exit
        System.out.println("-----------For Loop---------------");
        boolean condition =false;
        for (; condition;) { // never gets executed, sinse condition is false, if true, infinite
            System.out.println(("Hello Cydeo"));
        }

        System.out.println("-----------While LOOP------------");
        while(condition){
            System.out.println("Hello Cybertek");// never gets executed, since the statement is false
        }

        System.out.println("---------Do WHILE LOOP------------");
        // even if condition is false, the condition will be executed at least ONCE, then it will exit
        do{
            System.out.println("Hello Cydeo");
        }while(condition);// can use break statement to exit if condition is true

    }
}
