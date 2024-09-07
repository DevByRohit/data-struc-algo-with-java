import java.util.Scanner;

public class B_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        float base = scan.nextInt();

        System.out.print("Enter height in cm: ");
        float height = scan.nextInt();

        float areaOfTriangle = (base * height) / 2;
        System.out.println("Area of triangle: " + areaOfTriangle + "cm");

        scan.close();
    }
}
