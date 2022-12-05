package day31_Inheritance;

public class ProtectedAccessModifier {
    /*
    Can sometimes be visible outside the package

    There are conditions that have to be met to be seen outside tha package

    It can be shown outside the class ONLY IN SUBCLASSES
     */

    protected static int a =100;
    protected static void methodA(){
        System.out.println("MethodA");
    }
}
