package day27_AccessModifiers;

public class AccessModifiers {

    /*
    Access Modifiers:
   1. public    2. protected       3. default(no modifier)     4. private   (1.~4. from most visible to most)

    They determine visibility and accessibility (variable/method/class)
    public - less restricted among all
    private - the least visible, most restricted

    A top-level java class can have two access modifiers: public and default
    Variables and Constructors can be any of 4

    Public: class, package, subclasses, world (always accessible)
    Default: class, package (visible within a class or a package. Not outside)
    Private: class only

     */
    public static int publicData =200;// will be visible everywhere
    protected static int protectedData=100;//class. package, but different package depends. Could be accessible if we create a subClass outside the package

    static int defaultData=300;// default does not require a keyword. Same class, same package, not outside those two

    private static int privateData=500;//can be accessible only within a class

    public AccessModifiers(){
        //used for creating objects
        // can be likewise created everywhere if public, protected in class, package, sometimes subClass, default:package and class, private-class only
    }

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);
        publicMethod();
    }

    public static void publicMethod(){
        System.out.println("Public");
    }
    protected static void protectedMethod(){
        System.out.println("Protected");
    }
    static void defaultMethod(){
        System.out.println("Default");
    }
    private static void privateMethod(){
        System.out.println("Private");
    }
}
