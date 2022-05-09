package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account katy = new Account("Katy",123456, 1000);
        Bank SEB = new Bank();
        SEB.addAccount(katy);

        boolean cardInMachine = true;
        ATM myAmazingATM = new ATM();

        System.out.println("Enter your account number: ");
        Scanner scan = new Scanner (System.in);
        int scannedAccountNumber = scan.nextInt();

        Account userAccount = SEB.getAccount(scannedAccountNumber);
        myAmazingATM.showMenu();


        while(cardInMachine){
            myAmazingATM.showMenu();
            int userChoice = scan.nextInt();

            switch(userChoice){
                case 1:
                    //check balance
                case 2:
                    //
        }



        }
    }
}
