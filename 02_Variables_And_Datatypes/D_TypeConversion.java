/*
Summary:
1. Implicit Conversion (Widening): Safe, automatic, and occurs when a smaller type is converted into a larger one.

2. Explicit Conversion (Narrowing): Manual, may cause data loss, and is needed when converting larger types into smaller types.

3. Type Promotion: In mixed-type expressions, smaller data types are promoted to larger ones to maintain precision.

4. Autoboxing & Unboxing: Automatic conversion between primitive types and their corresponding wrapper classes.

*/

public class D_TypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int a = 100;
        double b = a; // int is implicitly converted to double
        System.out.println("Implicit Conversion: int to double = " + b); // Output: 100.0

        // Explicit Type Conversion (Narrowing)
        double x = 10.99;
        int y = (int) x; // double explicitly cast to int
        System.out.println("Explicit Conversion: double to int = " + y); // Output: 10

        // Type Promotion in Expressions
        byte byteValue = 40;
        short shortValue = 50;
        int result = byteValue + shortValue; // Both byte and short are promoted to int
        System.out.println("Type Promotion in Expression: " + result); // Output: 90

        // Autoboxing and Unboxing
        Integer intObject = a; // Autoboxing
        int z = intObject; // Unboxing
        System.out.println("Autoboxing & Unboxing: " + z); // Output: 100
    }
}
