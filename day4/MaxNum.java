import java.util.*;

import utils.MathUtils;

public class MaxNum {

    // int findMax(int a, int b, int c) {
    //     if(a>=b && a>= c) {
    //         System.out.println("Max number is "+a);
    //         return a;
    //     } else if(b>=a && b>= c) {
    //         System.out.println("Max number is "+b);
    //         return b;
    //     } else {
    //          System.out.println("Max number is "+c);
    //         return c;
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();

        MathUtils.findMax(num1, num2, num3); //added from utils - reused method
        sc.close();
    }
}