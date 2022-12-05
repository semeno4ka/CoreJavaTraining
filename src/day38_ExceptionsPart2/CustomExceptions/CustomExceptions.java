package day38_ExceptionsPart2.CustomExceptions;

class CustomCheckException extends Exception{

}
class CustomUncheckedException extends RuntimeException{

}

public class CustomExceptions {
    /*
    There should be 'is a' relationship with Exception Class(child) and RuntimeException(child)

    Custom Exception:
           1. to create unchecked exception you need to inherit from RuntimeException class
           2. to create checked exception you need to inherit from exception class itself
     */
    public static void main(String[] args) {

        try {
            throw new CustomCheckException();//since it is checked, it should be handled immediately: try&catch ot throws
        } catch (CustomCheckException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------");
        throw new CustomUncheckedException();

    }
}
