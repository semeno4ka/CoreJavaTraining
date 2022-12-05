package day18_GarbageCollection;

public class BankAccount {


    public String accountHolder;
    public long account;
    public double balance;


    public void setInfo(String accountHolder, long account) {
        this.accountHolder = accountHolder;
        this.account = account;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", account=" + account +
                ", balance= $" + balance +
                '}';
    }


    //only for displyaing balance separately
    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }

    public void deposit(double amount){
        if(amount<1){
            System.out.println("Insufficient deposit amount "+amount);
            return;
        }

        System.out.println("Depositing "+amount+ " to "+account);
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient withdraw amount");
            return;
        }

        balance -= amount;
    }
}
