/*
# Operators and Expressions in Java
Operators and expressions are fundamental concepts in Java that enable the manipulation of data, performing calculations, comparisons, logical operations, and more. Java offers a rich set of operators that work with variables and values to create expressions that execute various operations.

Q. What is an Operator?
An operator is a special symbol or keyword used to perform operations on variables and values. For example, the + operator adds two numbers, and the == operator checks whether two values are equal.

Q. What is an Expression?
An expression is a combination of variables, operators, and values that produces a result. For example:

Example:
int result = 5 + 3; // '5 + 3' is an expression

# Types of Operators in Java
Java provides various types of operators grouped into different categories:

1. Arithmetic Operators
2. Assignment Operators
3. Relational (Comparison) Operators
4. Logical Operators
5. Bitwise Operators
6. Unary Operators
7. Ternary (Conditional) Operator
8. Instanceof Operator
9. Typecast Operator

1. Arithmetic Operators
Arithmetic operators perform basic mathematical operations such as addition, subtraction, multiplication, and division.

Operator	            Description	                Example
    +	                Addition	                x + y
    -	                Subtraction	                x - y
    *	                Multiplication	            x * y
    /	                Division	                x / y
    %	                Modulus (remainder)	        x % y

Examples:
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));       // Output: 15
        System.out.println("Subtraction: " + (a - b));    // Output: 5
        System.out.println("Multiplication: " + (a * b)); // Output: 50
        System.out.println("Division: " + (a / b));       // Output: 2
        System.out.println("Modulus: " + (a % b));        // Output: 0
    }
}

2. Relational (Comparison) Operators
These operators compare two values and return a boolean (true or false).

Operator	   Description	                Example
==	           Equal to	                    a == b
!=	           Not equal to	                a != b
>	           Greater than	                a > b
<	           Less than	                a < b
>=	           Greater than or equal to	    a >= b
<=	           Less than or equal to	    a <= b

Examples:
int a = 10;
int b = 20;
boolean result = a < b; // result = true

3. Logical Operators
Logical operators are used to perform logical operations (AND, OR, NOT) between boolean values.

Operator	Description	        Example
&&	        Logical AND	        a && b (true if both are true)
||	        Logical OR	        a || b (false if both are false)
!	        Logical NOT	        !a (negates the boolean)

Examples:
boolean a = true;
boolean b = false;
boolean result = a && b; // result = false

4. Bitwise Operators
Bitwise operators work on bits (binary representation of numbers).

Operator	Description	            Example
&	        Bitwise AND	            a & b
|	        Bitwise OR              a | b
^	        Bitwise XOR	            a ^ b
~	        Bitwise Complement	    ~a

Examples:
int a = 5;  // 0101 in binary
int b = 3;  // 0011 in binary
int result = a & b;  // result = 1 (0001 in binary)


5. Assignment Operators
Assignment operators are used to assign values to variables.

Operator	    Description	                Example
=	            Simple assignment	        a = b
+=	            Add and assign	            a += b (a = a + b)
-=	            Subtract and assign	        a -= b (a = a - b)
*=	            Multiply and assign	        a *= b (a = a * b)
/=	            Divide and assign	        a /= b (a = a / b)
%=	            Modulus and assign	        a %= b (a = a % b)

Examples:
int x = 10;
x += 5;  // x = x + 5 -> x becomes 15

6. Unary Operators
Unary operators work with a single operand and change its value or state.

Operator	    Description	                            Example
+	            Unary plus (promotes positive value)	+a
-	            Unary minus (negates value)	            -a
++	            Increment (pre/post)	                ++a or a++
--	            Decrement (pre/post)	                --a or a--
!	            Logical NOT (negates a boolean)	        !a

Examples:
int x = 10;
x++;  // x becomes 11 (post-increment)

7. Ternary Operator (Conditional Operator)
The ternary operator ? : is a shorthand for if-else conditions.

Syntax:
condition ? expression1 : expression2

Example:
int a = 10;
int b = 20;
int result = (a > b) ? a : b; // result = 20


8. Shift Operators
Shift operators shift the bits of a number to the left or right.

Operator	    Description	                Example
<<	            Left shift	                a << 2
>>	            Right shift	                a >> 2
>>>	            Unsigned right shift	    a >>> 2

Examples:
int a = 8; // 1000 in binary
int result = a << 1; // result = 16 (10000 in binary)

*/
public class A_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // Output: 15
        System.out.println("Subtraction: " + (a - b)); // Output: 5
        System.out.println("Multiplication: " + (a * b)); // Output: 50
        System.out.println("Division: " + (a / b)); // Output: 2
        System.out.println("Modulus: " + (a % b)); // Output: 0

        // Relational (Comparison) Operators
        a = 10;
        b = 20;
        boolean result = a < b; // result = true
        System.out.println("Result: " + result);

        // Logical Operators
        boolean x = true;
        boolean y = false;
        result = x && y; // result = false

        // Bitwise Operators
        a = 5; // 0101 in binary
        b = 3; // 0011 in binary
        int result2 = a & b; // result = 1 (0001 in binary)
        System.out.println(result2);

        // Assignment Operators
        b = 10;
        b += 5; // b = b + 5 -> b becomes 15

        // Unary Operators
        int xy = 10;
        xy++; // xy becomes 11 (post-increment)
        System.out.println(xy);

        // Ternary Operator (Conditional Operator)
        a = 10;
        b = 20;
        int result3 = (a > b) ? a : b; // result
        System.out.println("Result: " + result3);

        // Shift Operators
        a = 8; // 1000 in binary
        int result4 = a << 1; // result = 16 (10000 in binary)
        System.out.println(result4);
    }
}
