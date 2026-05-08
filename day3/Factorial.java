import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        long fact = 1;

        for(int i=1; i<= num; i++) {  
            fact = fact * i; 
        }
        //Same using while loop
        // int i=1;
        // while(i<=num) {
        //     fact = fact * i;
        //     i++;
        // }

        System.out.println("Factorial of "+ num + " is "+ fact);
        sc.close();
    }
}