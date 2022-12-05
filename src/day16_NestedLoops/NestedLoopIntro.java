package day16_NestedLoops;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("---------------");

        for (int i = 0; i <5 ; i++) {// any code fragment can be placed in loops body

            for (int j = 0; j <5 ; j++){  // have to change variable name because it is within same loop structure
                System.out.println("Wooden Spoon");
            }
            // when outer loop runs once, the inner loop runs all 5 time, each time
        }
    }
}
