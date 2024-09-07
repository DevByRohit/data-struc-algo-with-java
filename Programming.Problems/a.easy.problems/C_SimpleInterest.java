import java.util.Scanner;

public class C_SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scan.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scan.nextDouble();

        System.out.print("Enter Time in Years: ");
        double time = scan.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        scan.close();
    }
}
