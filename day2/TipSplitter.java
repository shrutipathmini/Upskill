
import java.util.Scanner;

public class TipSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bill amount");
        double billAmt = sc.nextDouble();

        System.out.println("Enter tip percentage");
        double tip = sc.nextDouble();

        System.out.println("Enter number of people");
        int people = sc.nextInt();

        double tipAmt = (billAmt * tip) /100;

        double totalBill = billAmt + tipAmt;

        double splitAmt = totalBill / people;

        System.out.println("Total split amount per person = "+splitAmt);
        sc.close();
    }
}