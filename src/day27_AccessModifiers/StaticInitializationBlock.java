package day27_AccessModifiers;

public class StaticInitializationBlock {
    public static int a;
    public static int b;
    public static String c; // for all the objects of the class these value will be used

    static{ // static block is used to initialize the value of variables which cannot be simply assigned as a=100 and require a block of code to specify the value
            // such as: public static ExcelSheet sheet; wil;l require 3-4 steps to be set.A specific code fragment-block
        a=100;
        b=200;
        c="Java"; // these will be executed first (assigned)
    }
    //Need to be called through the class name
    //You never go wrong if you use static Block for initializing static variables

}
