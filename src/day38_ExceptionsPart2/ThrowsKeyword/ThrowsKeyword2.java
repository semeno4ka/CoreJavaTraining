package day38_ExceptionsPart2.ThrowsKeyword;

import day32_FinalKeyword.final_keyword.FinalKeyword;

import java.io.FileInputStream;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Advantages:
        -fast, neat and clean
        Disadvantages:
        -only for checked exceptions
        -not a permanent solution
        -it only ignores the problem, but doesn't solve
        -whenever method is called, it will always show exception again
        -could be ideal for main method, but definitely not for custom methods
         */

        method1();
    }

    public static void pauseFor5Sec() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
            pauseFor5Sec();
        System.out.println("Hello Cydeo");
    }

    //if you are creating utility method(method you will always use in other classes, it is better to use try&catch)

    public static void method2() throws Exception{
        System.out.println("1st Program started");
        Thread.sleep(3000);
        System.out.println("1st Program ended");
        new FileInputStream("");
        Thread.sleep(5000);
    }
}
