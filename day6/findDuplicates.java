package day6;
import java.util.HashMap;
import java.util.HashSet;

public class findDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 5 ,4};
        int sum =0;
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(set.add(num)) {
                System.out.println(num); //prints numbers excluding duplicate
                //sum = sum+num; //takes sum of all excluding duplicates
            }
        }
        //System.out.println(sum);

        //USING HASHMAP
        // String sentence = "java is easy java is powerful";

        // String[] words = sentence.split(" ");
        // HashMap<String, Integer> map = new HashMap<>();

        // for (String word : words) {
        //     map.put(word, map.getOrDefault(word, 0) + 1);
        // }

        // System.out.println(map);
    }
}