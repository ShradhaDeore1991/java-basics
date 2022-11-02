package oops.account;

import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {
        int count = 0, counter = 0;
        int accountNo = 0, accountBalance = 0;
        String accountType = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("***Input the asked details***");
        try{
        System.out.println("Enter Account Number:");
        accountNo = sc.nextInt();
        System.out.println("Enter Account Type:");
        accountType = sc.next();

        System.out.println("Press 1 for Saving Account");
        System.out.println("Press 1 for Current Account");
        int choose = sc.nextInt();

            System.out.println("Enter Account balance:");
            accountBalance = sc.nextInt();

        switch (count) {
            case 1:
                System.out.println("You Have Selecting Saving Account");
              //  display();
                break;
            case 2:
                System.out.println("You Have Selecting Current Account");
             //   display();
                break;
            default:
                System.out.println("Invalid Inout!");

        }


            NewAccount a = new NewAccount(accountNo, accountBalance, accountType);


            while (counter == 0) {
                System.out.println("\n****Please select the services You Want****");
                System.out.println("press-1 for Deposit");
                System.out.println("press-2 for WithDraw");
                System.out.println("press-3 for Display Account Details");
                System.out.println("press-4 for Display Your Balance");
                System.out.println("press-5 for exits");
                count = sc.nextInt();
                switch (count) {
                    case 1:
                        System.out.println("Enter amount to be deposit");
                        a.deposit(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Enter amount to be withdraw");
                        a.withdraw(sc.nextInt());
                        break;
                    case 3:
                        System.out.println(a.displayAccountDetails());
                        break;
                    case 4:
                        System.out.println("Your Balance is :" + a.getAccountBalance());
                        break;
                    case 5:
                        counter++;
                        break;

                    default:
                        System.out.println("please press valid input");
                        break;

                }

            }
        }catch(Exception e){
            System.out.println("Please enter valid input");

        }
        }
    }

