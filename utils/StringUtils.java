package utils;

public class StringUtils {
    public static String revString(String str) {
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string "+reverse);
        return reverse;
   }
}