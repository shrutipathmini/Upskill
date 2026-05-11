package day6;

public class SumArray {
    public static void main(String[] args) {
       int arr[] = {10, 20, 30, 40};

       int sum =0;
       for(int ar : arr) {
        sum = sum + ar;
       }
       System.out.println("sum = "+sum);
    }
}