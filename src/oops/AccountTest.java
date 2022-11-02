package oops;

import java.util.Scanner;

class Customer{
    private int custId;
    private String custName;

    public Customer(int id, String name) {
        this.custId = id;
        this.custName = name;
    }

    public String display(){

    return "\n\nCustomerId :"+custId+"\n"+"CustomerName :"+custName+"\n"+"CustomerAddress :";
    }
}
class AccountInfo{
    int accountNo;
    double accountBalance ;
    String accountType;
    Customer c;

    public AccountInfo(int accNo, double accBalance,String accType,Customer c ) {
        this.accountNo = accNo;
        this.accountBalance = accBalance;
        this.accountType = accType;
        this.c = c;
    }

    public void display(){
        System.out.println("\n****Customer Details****"+c.display());
        System.out.println("\n****Account Details****");
        System.out.println("\nAccount Number:"+ accountNo);
        System.out.println("Account Balance:"+ accountBalance);
        System.out.println("Account Type:"+ accountType);

    }
}
public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer id:");
        int custId = sc.nextInt();

        System.out.println("Enter Name: ");
        String custName = sc.next();

        Customer c = new Customer(custId,custName);

        System.out.println("Enter Account number:");
        int accountNo = sc.nextInt();

        System.out.println("Enter Account Balance: ");
        int accountBalance = sc.nextInt();

        System.out.println("Enter Account Type: ");
        String accountType = sc.next();

        AccountInfo acc = new AccountInfo(accountNo,accountBalance,accountType,c);
       // c.display();
        acc.display();
    }
}
