package oops.account;

public class NewAccount {
    private int accountNo;
    private double accountBalance,  withdrawAmount, depositAmount;
    private String accountType;
     NewAccount()
    {

    }

    NewAccount(int accNo, double accBalance, String accType) {
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
