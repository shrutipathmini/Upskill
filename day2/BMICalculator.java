
import java.util.Scanner;


public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight");
        double weight = sc.nextDouble(); 
        System.out.println("Enter your height");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI = "+bmi);

        if(bmi < 18.5) {
            System.out.println("Category : Underweight");
        } else if (bmi >=18.5 && bmi <=24.9) {
            System.out.println("Category : Normal weight");
        } else if(bmi > 24.9) {
            System.out.println("Catergory : Overweigth");
        } else {
            System.out.println("Catergory : Obese");
        }
        sc.close();
    }
}
