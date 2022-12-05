package day27_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    {// you cannot pass any parameters (name, age)
        name = "James"; // can only execute known parameters to all objects
        age=20; // every object will be 20
    }

    public InstanceInitializationBlock(String name, int age) { // in constructor, you can pass parameters and make the value of each different
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        /*InstanceInitializationBlock obj1 = new InstanceInitializationBlock(); // is used if you need a certain default value to ALL OBJECTS
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name);// james
        System.out.println(obj2.name);//james*/
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Kim",19);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("John",21);
        System.out.println(obj1.name);
        System.out.println(obj2.name);

        }
}
