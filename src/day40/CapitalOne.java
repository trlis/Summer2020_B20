package day40;

import day39_CustomClass.BankAccount;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Waqar = new BankAccount();

        Beslan.setAccountInfo("Checking", "Beslan", "451684353846");
        Beslan.setAccountInfo("Checking", "Ahmet", "764516315358");
        Beslan.setAccountInfo("Checking", "Viorel", "451863153568");
        Beslan.setAccountInfo("Checking", "Nurmamet", "9789833352");
        Beslan.setAccountInfo("Checking", "Waqar", "15316843835");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Nurmamet, Waqar));

        for(BankAccount each: accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("=============================================");

        accounts.removeIf( each-> each.balance < 1000);
        System.out.println(accounts.size()-1);
       /*
        for(BankAccount each: accounts){
            each.getAccountInfo();
            */


    }
}
