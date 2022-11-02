package oops;

import java.util.Scanner;

class Account {
    int accountNo;
    double accountBalance,  withdrawAmount, depositAmount;
    String accountType;
    Scanner sc = new Scanner(System.in);



    public void setAccountDetails() {

        System.out.println("***Input the asked details***");
        System.out.println("Enter Account Number:");
        accountNo = sc.nextInt();

        System.out.println("Enter Account Type:");
        accountType = sc.next();

        System.out.println("Enter Account balance:");
        accountBalance = sc.nextDouble();

    }

    public void displayAccountDetails() {
        System.out.println("***Inputted Student Details***");
        System.out.println("Account Number:" + accountNo);
        System.out.println("Account Type:" + accountType);
        System.out.println("Account balance:" + accountBalance);
    }

    public void withdraw() {
        System.out.print("\nEnter money to be withdrawn:");
        withdrawAmount = sc.nextInt();
        if (accountBalance >= withdrawAmount) {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Please collect your money :" + accountBalance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit() {
        System.out.print("\nEnter money to be deposited:");
        depositAmount = sc.nextInt();
        accountBalance = accountBalance + depositAmount;
        System.out.println("Your Money has been successfully deposited :" + accountBalance);

    }
}
public class Main1 {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAccountDetails();
        a.displayAccountDetails();
        a.withdraw();
        a.deposit();
    }
}
