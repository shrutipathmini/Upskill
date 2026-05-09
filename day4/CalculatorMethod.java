import java.util.*;
import utils.MathUtils;

public class CalculatorMethod {
//    double bmiCalc(double height, double weight) {
//         double bmi = weight / (height * height);

//         if(bmi < 18.5) {
//             System.out.println("Category : Underweight");
//         } else if (bmi >=18.5 && bmi <=24.9) {
//             System.out.println("Category : Normal weight");
//         } else if(bmi > 24.9) {
//             System.out.println("Catergory : Overweigth");
//         } else {
//             System.out.println("Catergory : Obese");
//         }
//         return bmi;
//    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double height = sc.nextDouble();
    double weight = sc.nextDouble();

   //  CalculatorMethod cl = new CalculatorMethod(); //creating object
    MathUtils.bmiCalc(height, weight); // added method in utls and imported from there

    sc.close();
   }
}   

