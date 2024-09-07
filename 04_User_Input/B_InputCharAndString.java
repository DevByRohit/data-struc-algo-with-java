import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B_InputCharAndString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.print("Enter Full Name : ");
        String name = scan.next(); // This will take first word of the sentence or String
        System.out.println(name);

        System.out.print("Enter Your Full Name Again : ");
        scan.nextLine();
        String name2 = scan.nextLine(); // This statement will take full sentence or String
        System.out.println(name2);

        System.out.print("Enter the character : ");
        char ch = scan.next().charAt(0);
        System.out.println(ch);

        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        String str = ft.format(new Date());
        System.out.println(str);

        scan.close(); // Close the Scanner object to release resources.
    }
}
