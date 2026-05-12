package day6;
import java.util.*;

public class HashsetExamples {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 2, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int n : arr) {
            if(!set.add(n)) {
                // System.out.println(n + " is duplicate. Cannot add");
                count += 1;
            }
        }
        System.out.println("Count of duplicates "+count);
        System.out.println(set);
    }
}