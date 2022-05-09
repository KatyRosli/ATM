package com.company;

public class ATM {

    public void showMenu(){
        System.out.println("Welcome to SEB ATM");
        System.out.println("What would you like to do?");
        System.out.println("1. Check my balance");
        System.out.println("2. Withdraw money from my account");
        System.out.println("3. Retrieve card");
    }
    public void checkBalance(Account account){
        int bal = account.getBalance();
        System.out.println("Your balance is: " + bal);

    }
}
