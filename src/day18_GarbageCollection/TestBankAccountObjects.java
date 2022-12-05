package day18_GarbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {
        BankAccount obj1= new BankAccount();
        obj1.setInfo("Gadir", 123456);

        System.out.println(obj1);

        obj1.deposit(1000);
        obj1.checkBalance();

        obj1.withdraw(1700);
        obj1.checkBalance();

        System.out.println("________________________________");

        BankAccount obj2= new BankAccount();
        obj2.setInfo("Kate", 547836287);

        BankAccount obj3= new BankAccount();
        obj3.setInfo("Filipp",737850454);

        obj2.deposit(1000);
        obj3.deposit(1300);
        System.out.println(obj2);
        System.out.println(obj3);

        obj2.withdraw(700);
        System.out.println(obj2);
        System.out.println(obj3);


    }
}
