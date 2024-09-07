import java.util.Scanner;
/*

# Scanner class is used to read user input.
1. System.in is a standard input stream in Java.
2. nextInt() method reads an integer from the user input.
3. nextFloat() method reads a float from the user input.
4. nextDouble() method reads a double from the user input.
5. nextByte() method reads a byte from the user input
6. nextShort() method reads a short from the user input.
7. nextLong() method reads a long from the user input.
8. nextBoolean() method reads a boolean from the user input.
9. nextLine() method reads a line of text from the user input.
10. next() method reads the next token from the user input.
11. charAt(int index) method returns the character at the specified index in the string.

*/
public class A_TakingInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextByte();
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter your name: ");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);

        System.out.print("Enter character: ");
        char ch = scan.next().charAt(1);
        System.out.println(ch);
        scan.close();
    }
}
