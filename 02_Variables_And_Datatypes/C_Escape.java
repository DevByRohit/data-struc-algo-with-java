/*

Here’s a list of the most commonly used escape sequences:

Escape Sequence | Meaning                       |Example
    \"	        | Double quote (")	            |"He said, \"Hello\""
    \'	        | Single quote (')	            |"It\'s a beautiful day!"
    \\	        | Backslash (\)	                |"This is a backslash: \\ "
    \n	        | Newline (Line Break)	        |"First Line\nSecond Line"
    \t	        | Tab (Horizontal Tab)	        |"Column1\tColumn2"
    \b	        | Backspace	                    |"Hello\b\b\bWorld"
    \r	        | Carriage Return	            |"Hello\rWorld"
    \f	        | Formfeed	                    |"Page1\fPage2"
    \u00A9	    | Unicode character (Hex value  |"\u00A9" (© symbol)
    
*/

public class C_Escape {
    public static void main(String[] args) {
        // 1. Double Quote (\"):
        String message1 = "He said, \"Hello, world!\"";
        System.out.println(message1);
        // Output: He said, "Hello, world!"

        // 2. Single Quote (\'):
        String message2 = "It\'s a beautiful day!";
        System.out.println(message2);
        // Output: It's a beautiful day!

        // 3. Backslash (\\):
        String path = "C:\\Program Files\\Java";
        System.out.println(path);
        // Output: C:\Program Files\Java

        // 4. Newline (\n):
        String message3 = "Hello\nWorld";
        System.out.println(message3);
        // Output:
        // Hello
        // World

        // 5. Tab (\t):
        String table = "Column1\tColumn2";
        System.out.println(table);
        // Output: Column1 Column2

        // 6. Backspace (\b):
        String example1 = "Hellooo\b";
        System.out.println(example1);
        // Output: Helloo

        // 7. Carriage Return (\r):
        String example2 = "Hello\rWorld";
        System.out.println(example2);
        // Output: World (replaces "Hello")

        // 8. Formfeed (\f):
        String message4 = "Page 1\fPage 2";
        System.out.println(message4);

        // 9. Unicode character (\u00A9):
        String copyright = "\u00A9 2024";
        System.out.println(copyright);
        // Output: ? 2024

    }
}
