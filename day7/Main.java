package day7;

public class Main {
    public static void main(String[] args){
        //Create person objects
        Person p1 = new Person("ammu", 33, "ammu@test.com");
        Person p2 = new Person("shami", 34, "shami@test.com");

        p1.displayInfo();
        // p2.displayInfo();

        BankAccount p1Account = new BankAccount("ammu123", p1, 5000);
        BankAccount p2Account = new BankAccount("shami123", p2, 10000);

        p1Account.printStatement();

        p1Account.depositAmt(500);
        p1Account.printStatement();

        p2Account.printStatement();

        p2Account.depositAmt(5000);
        p2Account.printStatement();

        p2Account.withdrawAmt(500);
        p2Account.printStatement();

        System.out.println("Alice's balance via getter: £" + p1Account.getBalance());
    }
}