import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int originalNum = sc.nextInt();
        int reverse = 0;
        int num = originalNum;

        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        //Same using for loop
        // for(; num>0 ; num = num/10 ) {
        //     int digit = num % 10;
        //     reverse = reverse * 10 + digit;
        // }

        if(originalNum == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
        sc.close();
    }
}