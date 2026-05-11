package day6;
import java.util.*;

public class WordLength {
    public static void main(String[] args) {
        String[] words = {"two", "can", "to","three","four"};
        HashMap<Integer, ArrayList<String>> groups = new HashMap<>();

        for(String word : words) {
            int len = word.length();
            if(!groups.containsKey(len)) {
                groups.put(len, new ArrayList<>());
            }
            groups.get(len).add(word);
        }

        for(int len : groups.keySet()) {
            System.out.println(len + "letters: " + groups.get(len));
        }
    }
}