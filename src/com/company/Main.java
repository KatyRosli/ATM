package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank theBank = new Bank();
        Account myAccount = new Account(1122, 1000);
        Account yourAccount = new Account(3344, 5000);
        theBank.addAccount(myAccount);
        theBank.addAccount(yourAccount);

        ATM awesomeATM = new ATM();
        boolean cardInMachine = true;


        System.out.println("Enter your account number: ");
        Scanner scan = new Scanner (System.in);
        int acountNumber = scan.nextInt();
        Account account = theBank.getAccount(accountNumber);


        while(cardInMachine){
            awesomeATM.showMenu();
            int userChoice = scan.nextInt();
            switch(choice) {

                case 1:
                    awesomeATM.checkBalance(account);
                    //check balance
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    int amount = scan.nextInt();
                    awesomeATM.withdrawMoney(account, amount);
                    break;

                case 3:
                    cardInMachine = false;
                    System.out.println("Goodbye : )");
                    break;
                default:
                    System.out.println("Invalid choice: (");

        }
        }
    }
}
