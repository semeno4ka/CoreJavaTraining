package day27_AccessModifiers;

public class StaticBlock {
    /*
    Before the main method static block was used to run the code
    Static block is the first thing that runs when the class is executed, prior the main method
    Runs just once

    A Static Block is also called static initialization block

     */
    public StaticBlock(){
        System.out.println("Constructor");// will be executed three times, since is called three times in main method
    }
    static{
        System.out.println("Static block");
    }
    //was runnable before java 8. Compiler always looks for static block first, then goes to main. No matter the order in code line, it goes first

    public static void main(String[] args) {
        System.out.println("Main Method");
        new StaticBlock();
        new StaticBlock();
        new StaticBlock(); // gets executed once in the beginning. No matter how many times it is written further, it won't be executed
    }
}
