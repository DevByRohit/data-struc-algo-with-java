import java.util.Scanner;

public class E_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.print("Temperature in Celsius: " + celsius);
        
        scan.close();
    }
}
