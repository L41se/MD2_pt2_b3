import java.util.Scanner;

public class ChangeTemparature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celcius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Change from fahrenheit to celcius");
            System.out.println("2. Change from celcius to fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Enter Celsius: ");
                    celcius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celcius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
            }


    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}


