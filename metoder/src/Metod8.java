import java.util.Scanner;

public class Metod8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange temperaturen i Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = convertCelsiusToFahrenheit(celsius);

        System.out.println(celsius + " Grader Celsius motsvarar " + fahrenheit + " grader Fahrenheit.");
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius / 5.0) * 9 + 32;
        return fahrenheit;
    }
}
