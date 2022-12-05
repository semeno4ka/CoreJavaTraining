package day27_AccessModifiers;

public class InstanceBlock {
    {
        System.out.println("Instance block");// will be executed as many times as many objects you have
    }
    public InstanceBlock(){
        System.out.println("Constructor");// for constructor, you need to create an object
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
    }
}
