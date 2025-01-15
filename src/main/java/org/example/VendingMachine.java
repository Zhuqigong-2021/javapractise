package org.example;

public class VendingMachine {
    public void setPrice(int price) {
        this.price = price;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    int price=80;
    int balance;
    int total;

    void showPrompt(){
        System.out.println("Welcome");
    }
    void insertMoney(int amount){
        balance=balance+amount;
    }

    void showBalance(){
        System.out.println(balance);
    }

    void getFood(){
        if(balance>=price){
            System.out.println("Here you are");
            balance =balance-price;
            total=total+price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
         vm.showPrompt();
         vm.showBalance();
         vm.insertMoney(100);
         vm.getFood();
         vm.showBalance();
    }

}
