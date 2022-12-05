package day37_Exceptions.ExceptionIntro;

public class ExceptionHandling {
    public static void main(String[] args) {
    }

    private static int numberReturn() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            return 5;//finally overrides try block in return method
        }
    }
}
