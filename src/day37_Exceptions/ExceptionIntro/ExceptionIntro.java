package day37_Exceptions.ExceptionIntro;

public class ExceptionIntro {
    /*
    Exception:
    - unwanted/unexpected events
    - occurs during compile time or during runtime
    - checked exception(during compile time) -  when you are writing and see red lining
    - unchecked exception  ( during runtime )- when you try to execute and get exception during execution
    - to prevent exceptions from crashing the program, we must write code that detects and handles them

    Unchecked exception:
    - code will compile even if you do not handle it, but it will terminate at line, where exception occurred
    - has 'IS A' relationship with RunTimeException(parent class). Important, since Parent class can help handle whatever exception occured


     Exception is different from bug. F.E. infinite loop can be a bug, but it will not throw an exception
     "bug" in your code can provide you a result although the result is incorrect - but an exception will return an error


     Checked exception:
     - occurs during compile time (while you are writing)
     - you cannot run the code until you fix the exception. Exceptions can be handled, errors cannot be handled
     - does not have 'IS A' relationship with RuntimeException class

                 !!!Error is not a problem with code, it is a problem with SYSTEM RESOURCE!!!
                                         cannot be recovered

      Error:
      - indicates that an illegal operation is being performed
      - occurs during runtime only
      - cannot be recovered, not recommended to handle them

      TRY & Catch (Exceptions)
      - to handle an exception(checked or unchecked), we can use try & catch block

      try{
              //try block statements
              //some code that might throw exception
      }catch(ExceptionClass e){
              //catch block statements
              //handle exception(if try block can't)
      }

      Additional Blocks for Try&Catch Block
      - you can give more than 1 catch block for single try block

      Rules for multiple catch block:
      - parent exception cannot be placed before child exception class (goes from children to parent, from narrowest to widest option)

    FINALLY BLOCK
    - an optional block that can be given after catch block
    - always executed after try&catch blocks whether an exception occurs or not



    FINAL VS FINALLY VS FINALIZE:
    - final:  keyword of something unchangeable
    - finalize: method that Garbage Collector uses to collect objects that are eligible for GC(every object has 'finalize' method)
    - finally: block used with try&catch block in the very end, no matter whether exception is handled or not
     */
}
