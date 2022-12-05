package day38_ExceptionsPart2.CustomExceptions;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){ // when new object is created, by default "It's break time" will be displayed
    super("It's break time");
    }

    public BreakTimeException(String message){
        super(message);
    }



}
