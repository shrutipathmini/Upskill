import java.util.*;
import utils.StringUtils;

public class ReverseString {
//    String revString(String str) {
//         String reverse = "";

//         for(int i=str.length()-1; i>=0; i--) {
//             reverse = reverse + str.charAt(i);
//         }
//         System.out.println("Reversed string "+reverse);
//         return reverse;
//    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string to reverse");
    String st = sc.nextLine();

    // ReverseString str = new ReverseString();
    StringUtils.revString(st);
    sc.close();
   }
}   