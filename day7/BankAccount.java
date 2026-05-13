package day7;
//linked with person and driver Main classes
public class BankAccount {
    private String accNumber;
    private double balance;
    private Person name;

    public BankAccount(String accNumer, Person name, double balance) {
        this.accNumber = accNumer;
        this.name = name;
        this.balance = balance;
    }

    public void depositAmt(double amount) {
        if(amount < 0) {
            System.out.println("Amount cannot be -ve");
        }
        balance = balance + amount;
        System.out.println("Deposited amount is " + balance);
    }

    public void withdrawAmt(double amount) {
        if(amount > balance) {
            System.out.println("insufficient funds");
        }
        balance = balance - amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNum() {
        return accNumber;
    }
    public Person getOwner() {
        return name;
    }
    public void printStatement() {
        System.out.println("── Account Statement ──────────────────");
        System.out.println("Account : " + accNumber);
        System.out.println("Owner   : " + name.getName());
        System.out.printf ("Balance : £%.2f%n", balance);
        System.out.println("───────────────────────────────────────");
    }
}