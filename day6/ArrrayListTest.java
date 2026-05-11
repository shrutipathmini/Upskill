package day6;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(); //creating new arraylist

        // arr.add("mango"); // adding element
        // System.out.println(arr.get(0)); 
        // arr.add(0, "cherry"); //adding element to 0
        // System.out.println(arr.get(0));
        // arr.add("apple"); 
        // System.out.println(arr.size());
        // arr.set(1, "banana"); // adding element to 1
        // System.out.println(arr.get(1)); 
        // System.out.println(arr.indexOf("banana")); //getting element at given index
        // System.out.println(arr.isEmpty()); // checking if array list is empty - false
        // System.out.println(arr.contains("pineapple")); // checking if given element present in arraylist

        // for(String a : arr) {   //printing array using for each
        //     System.err.println(a);
        // }

        arr.clear(); // clearing arraylist

        //iterating with index
        ArrayList<String> veg = new ArrayList<>();

        // veg.add("tomato");
        // veg.add("potato");
        // veg.add("onion");

        // for(int i=0;i<veg.size();i++) {
        //     System.out.println(i + " : " + veg.get(i));
        // }

        //filtering into new array list

        // ArrayList<Integer> score = new ArrayList<>();
        // score.add(45);
        // score.add(75);
        // score.add(80);
        // score.add(55);

        // ArrayList<Integer> pass = new ArrayList<>();
        // for(Integer scores : score) {
        //     if(scores >= 60) {
        //         pass.add(scores);
        //     }
        // }
        // System.out.println(pass);
    }
}