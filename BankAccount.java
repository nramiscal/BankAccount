import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance = 0;
    private double savingsBalance = 0;

    private static int numberOfAccounts = 0;
    private static double totalCash = 0;

    private String generateAccountNumber(){
		return ("" + Math.random()).substring(2, 12);
	}

    // constructor
    public BankAccount(){
        setAccountNumber(generateAccountNumber());
        this.numberOfAccounts++;
    }

    // setters
    public void setAccountNumber(String acctNum){
        this.accountNumber = acctNum;
    }

    public void setBalance (String type, double newBalance){
        if (type == "checking"){
            this.checkingBalance = newBalance;
        }
        else if (type == "savings"){
            this.savingsBalance = newBalance;
        }
    }

    // getters
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(String type){
        if (type == "checking"){
            return this.checkingBalance;
        }
        else if (type == "savings"){
            return this.savingsBalance;
        }
        else {
            System.out.println("not a valid account type");
            return 0;
        }
    }

    public static int howManyAccounts(){
        System.out.println("Number of open accounts: " + numberOfAccounts);
        return numberOfAccounts;
    }

    public static double showTotalCash(){
        System.out.println("Total Cash: " + totalCash);
        return totalCash;
    }


    public BankAccount deposit(String type, double amount){
        setBalance(type, getBalance(type) + amount);
        this.totalCash += amount;
        return this;
    }

    public BankAccount withdraw(String type, double amount){
        if (amount < this.getBalance(type)){
            this.setBalance(type, this.getBalance(type) - amount);
            this.totalCash -= amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
        return this;
    }
 }
