
import java.util.Scanner;


public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount");
        double principal = sc.nextDouble();

        System.out.println("Enter Time");
        double time = sc.nextDouble();

        System.out.println("Enter rate");
        double rate = sc.nextDouble();

        double SI = (principal * rate * time) / 100;

        System.out.println("Simple interest = "+SI);
        sc.close();
    }
}