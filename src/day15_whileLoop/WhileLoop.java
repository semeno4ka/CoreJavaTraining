package day15_whileLoop;
//REVIEWED
public class WhileLoop {
    public static void main(String[] args) {
        /*
        see it as repeated If statement) while condition is true, condition gets executed
        and you give while condition (boolean)
        gets terminated when condition gets false. Same as ForLoop,
        but for ForLoop we need to know how many times it will be executed
         */

        if(true){
            System.out.println("Hello World");
        }
        System.out.println("-------------");
        //repeated if stetment
        while(true){
            System.out.println("Hello Cydeo");// will be executed while condition is true
            // need to make condition false in order to terminate
        }
    }
}
