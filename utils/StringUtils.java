package utils;

import java.util.Arrays;

public class StringUtils {
    //To reverse a given string
    public static String revString(String str) {
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string "+reverse);
        return reverse;
   }

   //To find number of vowels inside a word
   public static String vowels(String str) {
        str = str.toLowerCase();
        int count=0; 
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            
            if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        System.out.println("Number of vowels ="+count);
        return str;
   }

   //To find if 2 words are anagram words
   public static void anagram(String str1, String str2) {
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
   }

   //To captilize first word of a letter
   public static String capit(String str) {
    
    String result = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    System.out.println(result);
    return str;

   }
}