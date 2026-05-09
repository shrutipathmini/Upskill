package day5;

import java.util.Scanner;

import utils.StringUtils;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        
        //call re usable method from string utils
        // StringUtils.vowels(word);
        int count = 0;
        word = word.toLowerCase();
        for (int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("number of vowels "+count);
        sc.close();
    }
}