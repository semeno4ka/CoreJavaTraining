package day18_GarbageCollection;

public class TestPizzaObjects {
    public static void main(String[] args) {

       Pizza pizza1 = new Pizza();// creating a new object
       //Pizza is its data type, determines what is stored in variable pizza1

     //  pizza1.size='M';
       pizza1.setInfo('L',2,3);

       Pizza pizza2 = new Pizza();
       // pizza2.size='S';
        pizza2.setInfo('S',1,2);
        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("-----------------");
        double total=0;
        for (int i = 0; i <20 ; i++) {
            Pizza small = new Pizza();
            small.setInfo('S',2,2);
            total += small.calcCost();
            Pizza medium = new Pizza();
            medium.setInfo('M',3,4);
            total += medium.calcCost();
            Pizza large = new Pizza();
            large.setInfo('L',4,5);
            total += large.calcCost();
        }

        System.out.println("total = $" + total);

    }
}
