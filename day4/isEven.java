import java.util.Scanner;

import utils.MathUtils;

public class isEven {
    //method to find even number
    // int isEvenNum(int num) {
    //     if(num%2 == 0) {
    //         System.out.println("Number is even"); 
    //     } else {
    //         System.out.println("Number is odd");
    //     }
        
    //     return num;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // isEven ev = new isEven(); //creating object
        MathUtils.isEvenNum(num);
        sc.close();
    }
}