package day34_Abstraction_Interface.interfaceIntro.animalTask;

public interface Playable {


    boolean isFriendly=true;// this variable by default is PUBLIC, static and final
    void play();// is abstract and public(private can be applied version9) by default. But can be static, abstract and default


    /*
     default void method(){
         // becomes instance in subclasses
     }
    public static void main(String[] args) {
        // isFriendly=false;  the value cannot be changed because it is final
        System.out.println(isFriendly);// if it was not static we would not be able to print it
    }
    */
}
