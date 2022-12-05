package day37_Exceptions.ExceptionIntro;

public class FinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch(RuntimeException e){
            System.out.println("Exception has been caught");
            e.printStackTrace();
            // SYSTEM.EXIT(1); TO STOP FINAL BLOCK EXECUTION
        }finally {
            System.out.println("Finally block");// REQUIRED FOR CODE FRAGMENTS THAT HAVE TO BE EXECUTED NO MATTER WHAT
            // THE ONLY WAY TO STOP FINAL BLOCK FROM EXECUTION IS TO SYSTEM.EXIT() BEFORE THE BLOCK
        }

    }
}
