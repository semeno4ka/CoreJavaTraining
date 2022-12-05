package day27_AccessModifiers;

public class Data {
    /*
    Regular import is used for importing Class anf files and other interfaces.
    Static import is used for accessing all the static members. Also more efficient
     */
    public  int a,b,c; //(instance variables)
    public static int x,y,z;//(static variables)

    public void method1(){
        System.out.println("Method1");
    }
    public void method2(){
        System.out.println("Method2");
    }
    public static void method3(){
        System.out.println("Method3");
    }
    public static void method4(){
        System.out.println("Method4");
    }
}
