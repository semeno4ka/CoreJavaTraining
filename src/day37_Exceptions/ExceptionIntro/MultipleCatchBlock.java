package day37_Exceptions.ExceptionIntro;


import day35_PolymorphismIntro.transportationTask.Car;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        Car car = null;
        try{
            car.drive();
        }catch(ArithmeticException e){
            System.out.println("1st catch block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("2nd catch block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("3rd catch block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("4rth catch block");
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println("5th catch block");
            e.printStackTrace();
        }

        System.out.println("Program ended");


    }
}
