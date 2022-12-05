package day38_ExceptionsPart2.CustomExceptions.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }
}
