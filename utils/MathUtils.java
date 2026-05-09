package utils;

public class MathUtils {
    public static double bmiCalc(double height, double weight) {
        double bmi = weight / (height * height);

        if(bmi < 18.5) {
            System.out.println("Category : Underweight");
        } else if (bmi >=18.5 && bmi <=24.9) {
            System.out.println("Category : Normal weight");
        } else if(bmi > 24.9) {
            System.out.println("Catergory : Overweigth");
        } else {
            System.out.println("Catergory : Obese");
        }
        return bmi;
   }

   public static int findMax(int a, int b, int c) {
        if(a>=b && a>= c) {
            System.out.println("Max number is "+a);
            return a;
        } else if(b>=a && b>= c) {
            System.out.println("Max number is "+b);
            return b;
        } else {
             System.out.println("Max number is "+c);
            return c;
        }
    }

    public static int isEvenNum(int num) {
        if(num%2 == 0) {
            System.out.println("Number is even"); 
        } else {
            System.out.println("Number is odd");
        }
        
        return num;
    }
} 