package day5;

import java.util.Scanner;

// import utils.StringUtils;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();

        System.out.println("Capitalized word: ");
        String result = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(result);

        //StringUtils.capit(word); // Reusable method
        sc.close();
    }
}