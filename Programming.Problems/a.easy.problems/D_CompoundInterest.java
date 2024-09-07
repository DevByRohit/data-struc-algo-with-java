import java.util.Scanner;

public class D_CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = scan.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scan.nextDouble();

        System.out.print("Enter Time in Years: ");
        double time = scan.nextDouble();

        double compoundInterest = principal * Math.pow(1 + rate / 100, time);
        System.out.print("Compound Interest: " + compoundInterest);
        scan.close();
    }
}
