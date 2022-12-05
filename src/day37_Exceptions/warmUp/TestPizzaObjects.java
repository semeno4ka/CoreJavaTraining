package day37_Exceptions.warmUp;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);
        Pizza pizza2 = new Pizza('S',2,3);
        System.out.println(pizza1==pizza2);// compares whether it is the same object - false
        System.out.println(pizza1.equals(pizza2));//compares the value of the objects - true

        Object obj = new Pizza('L',2,5);

       boolean r = obj.equals(pizza2);// obj equals is different, but executed will be the one that is overridden
        System.out.println(r);
        System.out.println(((Pizza) obj).calcCost());
        System.out.println(pizza1.calcCost());
    }
}
