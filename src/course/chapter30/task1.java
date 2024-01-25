package course.chapter30;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Yar", 10);

        System.out.println(bankAccount.getBalanceInfo());
        bankAccount.addBalance(15);
        System.out.println(bankAccount.getBalanceInfo());
        try {
            bankAccount.takeBalance(10);
        }
        catch (Exception ex){
            System.out.println("Не получилось снять деньги.");
        }
        System.out.println(bankAccount.getBalanceInfo());
        try {
            bankAccount.takeBalance(30);
        }
        catch (Exception ex){
            System.out.println("Не получилось снять деньги.");
        }
        System.out.println(bankAccount.getBalanceInfo());
    }
}
class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void addBalance(int add){
        balance += add;
    }
    public void takeBalance(int get) throws Exception{
        if (get > balance) {
            throw new Exception("Нельзя снять больше чем имеется!");
        }
        balance -= get;
    }
    public String getBalanceInfo(){
        return "Владелец: " + owner + " Баланс: " + balance;
    }

}

