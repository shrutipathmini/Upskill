package day6;
import java.util.*;

public class HashExamples {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Phone", 949);
        map.put("age", 33);
        map.put("Sham", 34);
        map.put("weight", 50);
        map.put("height", 158);
        // System.out.println(map.get("phone")); // null - case sensitive
        // System.out.println(map.get("Phone")); //949
        // System.out.println(map.containsKey("Sham"));

        //PRINT KEY AND VALUES IN HASHMAP
        // for(Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        
        //TO FIND LETTER COUNT
    //     String str ="automation";
    //     HashMap<Character, Integer> maps = new HashMap<>();
        
    //     for(char ch : str.toCharArray()) {
    //         maps.put(ch, maps.getOrDefault(ch, 0) + 1);
    //     }
    //     System.out.println(maps);

        //TO FIND WORD COUNT
        // String sentence = "I love learning java java";
        // String str[] = sentence.split(" ");

        // HashMap<String, Integer> map2 = new HashMap<>();
        // for(String word : str) {
        //     map2.put(word, map2.getOrDefault(word, 0) + 1);
        // }
        // System.out.println(map2);


    }
}