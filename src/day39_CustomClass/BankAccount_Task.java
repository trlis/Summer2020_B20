package day39_CustomClass;

public class BankAccount_Task {
    public static void main(String[] args) {

        BankAccount Dawud = new BankAccount();
        Dawud.setAccountInfo("Saving", "Dawud Abduwali", "123456789");

        Dawud.getAccountInfo();

        Dawud.deposit(1000);

        Dawud.checkBalance();

        Dawud.withDraw(500);

        Dawud.checkBalance();

        Dawud.withDraw(1000);
        Dawud.checkBalance();
    }
}
