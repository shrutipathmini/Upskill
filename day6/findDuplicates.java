package day6;
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
    }
}