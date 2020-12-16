package day48_Inheiritance;

public class BankAccount {

    /*
    WarmUp tasks:
    create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance
     */

    public String firstName;
    public String lastName;

    public BankAccount(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public static String bankName;

    static {
        bankName = "Bank of America";
    }

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {

    }

    public void setAccountNumber(long accountNumber) {

    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public void deposit(double amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing: $" + amount);
        balance -= amount;
    }

    public String availableBalance() {
        return "Available balance:" + getBalance();


    }

    public String toString(){
        return "Name: " + firstName + "\n" +
                "Last name: " + lastName;

    }






}


