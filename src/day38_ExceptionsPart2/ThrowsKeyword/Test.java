package day38_ExceptionsPart2.ThrowsKeyword;

import Utilities.Library;
import day38_ExceptionsPart2.CustomExceptions.BreakTimeException;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args)  {

        System.out.println("Hello Cydeo");
        Library.sleep(1.5);
        System.out.println("Hello Google");

        System.out.println("----------------");
        if(LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();
        }

        throw new BreakTimeException("Time to go home");
    }
}
