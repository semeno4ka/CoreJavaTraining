package day38_ExceptionsPart2.ThrowKeyword;

public class TestPersonObject {
    public static void main(String[] args) {


        Person p1 = new Person("Mike",15,'M');
        System.out.println(p1);

        try{ // catches exception and than moves on to the rest of the code
            p1.setAge(-25);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(p1);

        p1.setAge(156); // doesn't catch it, just terminates the program with no further code executed. Exception code provided
        System.out.println(p1);
       /*
        RuntimeException exception = new RuntimeException();
        throw exception; // can be created if to be used several times
        */
        // throw new Person("Jimmy"); Person DOES NOT HAVE 'IS A' RELATIONSHIP WITH THROWABLE
    }
}
