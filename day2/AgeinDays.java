
import java.util.Scanner;


public class AgeinDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        int ageInDays = age * 365;

        System.out.println("Your age in days = "+ageInDays);
        sc.close();

    }
}