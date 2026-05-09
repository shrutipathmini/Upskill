import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Program to conver C to F and viceversa

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to convert Farenheit to Celsius");
        System.out.println("Enter 2 to convert Celcius to Farenheit");
        int choice = sc.nextInt();

        double temperature, result;

        if(choice == 1) {
            System.out.println("Enter temperature");
            temperature = sc.nextDouble();

            result = (temperature -32) * 5/9;
            System.out.println("Converted to Celsius = "+result);
        } else {
            System.out.println("Enter temperature");
            temperature = sc.nextDouble();

            result = (temperature * 9/5) + 32;
            System.out.println("Converted to Farenheit = "+result);
        }
        sc.close();
    }
}