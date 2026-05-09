package day5;
import java.util.Arrays;
import java.util.Scanner;
//import utils.StringUtils;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = sc.nextLine();
        System.out.println("Enter second word");
        String str2 = sc.nextLine();

        //calling reusable method from string utils class
        //StringUtils.anagram(str1, str2);

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()) {
            System.out.println("Not an anagram");
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}