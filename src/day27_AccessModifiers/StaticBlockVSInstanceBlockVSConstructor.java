package day27_AccessModifiers;

public class StaticBlockVSInstanceBlockVSConstructor {
    // execution flow makes them all different

    public StaticBlockVSInstanceBlockVSConstructor(){
        System.out.println("Constructor");// can take arguments.  depends on object and is executed as many times as many objects you create
    }

    {
        System.out.println("Instance Block");// depends on object and is executed as many times as many objects you create
    }

    static{
        System.out.println("Static Block");// cannot be executed more than once
    }


    public static void main(String[] args) {

        System.out.println("Main method");

      new StaticBlockVSInstanceBlockVSConstructor(); // instance block gets executed before Constructor
        new StaticBlockVSInstanceBlockVSConstructor();
    }
}
