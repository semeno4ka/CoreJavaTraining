package day26_Statics;

public class ConstructorCalls {
    /*
        Constructors are special methods.
        Methods could call each other
        You can call a method by method name

        RULES:
        1. Constructors can't be called by its name within another constructor. You have to use ( this() )
        this: refers to instances.
        this. : calls instance methods and instance variables
        this() : calls constructor in another constructor
        2. Only Constructor can call Constructor
        3. Constructor call MUST be at the first step
        Calling another constructor has to be at the first step, before any other code fragments in another Constructor method
        4. One Constructor cannot call more than One Constructor within a Constructor. Max limit one constructor this()
        5. Constructor cannot call or contain itself


         */

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
       // ConstructorCalls(); can't call Constructor in another constructor as i would with regular method
        this();// no need to call the name, it is already reserved for Constructor
        //Calling another constructor has to be at the first step, before any other code fragments
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this();
        //calls default, for another constructor you have to provide a parameter for the Constructor to specify
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        method1();
        System.out.println("---------------");
        method2();
        System.out.println("---------------");


    }

        public static void method1(){
            System.out.println("Method1");
        }

    public static void method2(){
            method1();//can call another method within a regular method
        method2();// regular methods can call itself
        System.out.println("Method2");
    }


}
