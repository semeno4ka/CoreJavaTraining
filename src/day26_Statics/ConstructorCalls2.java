package day26_Statics;

public class ConstructorCalls2 {
    public ConstructorCalls2(){
        System.out.println("Default");// you can't call int Constructor because it contains default constructor.
        // Since Constructor can't contain itself, default cannot contain int Constructor anymore
    }
    public ConstructorCalls2(int a){
        this();// calls default
        System.out.println("int arg");
    }
    public ConstructorCalls2(String b){
        this(1);
        System.out.println("String arg");
    }
     //Constructor chain
    public static void main(String[] args) {
        ConstructorCalls2 obj1 = new ConstructorCalls2();
        System.out.println("--------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(1);// calls both default and int arg Constructor
        System.out.println("--------------------------");
        ConstructorCalls2 obj3 = new ConstructorCalls2("A");// all three are executed
    }
}
