package day39_CustomClass;

public class BankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    public double balance;


    public void setAccountInfo(String accountType, String accountHolder, String accountNumber){

        this.accountType =accountType;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public void getAccountInfo(){
        System.out.println("==========================");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: " + balance);
        System.out.println("==============================");


    }

    public void checkBalance(){
        System.out.println("Available Balance: " + balance);

    }
    public void deposit(double amount){
        System.out.println("Depositing $" +amount+" to the account #"+ accountNumber);
        balance += amount;

    }
    public void withDraw(double amount){

        if (amount >= balance) {
            System.out.println("not enough balance");
        }
        System.out.println("Withdraw $" + amount+ "from the account #" + accountNumber);
        balance-= amount;

    }

}
