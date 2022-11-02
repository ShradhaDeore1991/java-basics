package oops;
//import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

class AccountDetails{
    private int accountNo;
    private double accountBalance,  withdrawAmount, depositAmount;
    private String accountType;
    AccountDetails()
    {

    }


    public AccountDetails(int accNo, double accBalance, String accType) {
        this.accountNo = accNo;
        this.accountBalance = accBalance;
        this.accountType = accType;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public String getAccountType() {
        return accountType;
    }

    public String displayAccountDetails() {
        return "Account Number :"+accountNo+"\n"+"Account Type :"+accountType+"\n"+"Account Balance :"+accountBalance;
    }

    public void withdraw(int depositAmount) {
       // System.out.print("\nEnter money to be withdrawn:");
        //Scanner sc = new Scanner(System.in);
        withdrawAmount = depositAmount;
        if (accountBalance >= withdrawAmount) {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Please collect your money :" + withdrawAmount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(int depositAmount) {
       // System.out.print("\nEnter money to be deposited:");
        //Scanner sc = new Scanner(System.in);
        this.depositAmount = depositAmount;
        accountBalance += depositAmount;
        System.out.println("Your Money has been successfully deposited :" + accountBalance);

    }


}


public class AccountUsingConstructor {
    public static void main(String[] args) {
        int count,counter=0;

        //using getter and setters
//        AccountDetails accountDetails = new AccountDetails();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("***Input the asked details***");
//        System.out.println("Enter Account Number:");
//        accountDetails.setAccountNo(sc.nextInt());
//        System.out.println("Enter Account Type:");
//        accountDetails.setAccountType(sc.next());
//        System.out.println("Enter Account balance:");
//        accountDetails.setAccountBalance(sc.nextDouble());

        //using constructor
        int accountNo,accountBalance;
        String accountType;
        Scanner sc = new Scanner(System.in);
        System.out.println("***Input the asked details***");
        System.out.println("Enter Account Number:");
        accountNo = sc.nextInt();
        System.out.println("Enter Account Type:");
        accountType=sc.next();
        System.out.println("Enter Account balance:");
        accountBalance = sc.nextInt();

       AccountDetails a = new AccountDetails(accountNo,accountBalance,accountType);
   //    a.setAccountDetails();
       // a.displayAccountDetails();


       //System.out.println(a.displayAccountDetails());


        while (counter==0) {
           System.out.println("Please select the services You Want");
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
                   System.out.println("Your Balance is "+a.displayAccountDetails());
                   break;
               case 4:
                   System.out.println(a.getAccountBalance());
                   break;
               case 5:
                   counter++;
                   break;

               default:
                   System.out.println("please press valid input");
                   break;

           }
       }

    }
}


