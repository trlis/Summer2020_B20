package day48_Inheiritance;

public class BOA {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Ramazan", "Alic");
        obj.setAccountHolder(obj.firstName + " " + obj.lastName);
        obj.setAccountNumber(123135466);
        obj.setBalance(50);

        obj.availableBalance();
        obj.deposit(500);
        obj.availableBalance();

        obj.withdraw(700);
    }
}
