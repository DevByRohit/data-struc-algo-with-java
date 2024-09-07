import java.util.Scanner;

public class A_Arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numOne = scan.nextInt();

        System.out.print("Enter second number: ");
        int numTwo = scan.nextInt();

        // Addition
        int add = numOne + numTwo;

        // Substraction
        int subs = numOne - numTwo;

        // Multiplication
        int mul = numOne * numTwo;

        // Division
        int div = numOne / numTwo;

        // Modulus
        int modulus = numOne % numTwo;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + subs);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + modulus);

        scan.close();
    }
}