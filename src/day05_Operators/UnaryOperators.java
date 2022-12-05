package day05_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Pre-Increment/Pre-Decrements (CHANGE THE VALUE IMMIDIATELY)
        int a = 25;

        System.out.println(++a);// the result will be 11 (increased by 1)
        System.out.println(a);// will be printed 11

        int x = 100;
        System.out.println(--x);//99
        System.out.println(x);//99

        //Post-Increments/Post-Decrements (POSTPONES)
        int k = 25;
        System.out.println(k++);// 25
        System.out.println(k);// 26

        int g = 100;
        System.out.println(g--);//100
        System.out.println(g);//99

        int n = 30;
        int m = n++;// m= 30, n=31 (firstly, passes the current value, only then it will be 31)

        System.out.println("n =" + n);
        System.out.println("m = " + m);

        int q = 60;
        int p = q--; //p =60, q =59
        System.out.println("q = "+ q);
        System.out.println("p = "+ p);



    }
}
