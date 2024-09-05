/*
# Data Types in Java
Data types specify the size and type of values that can be stored in a variable. Java provides two categories of data types:
1. Primitive Data Types (Intrinsic)
2. Non-Primitive (Reference) Data Types (Drived)

a) Primitive Data Types:
Primitive data types are predefined by the language and represent simple values.

# There are 8 primitive data types in Java.
Data Type	    Size	    Description	              Example Values
byte	        1 byte	    from -128 to 127	      byte b = 10;
short	        2 bytes	    from -32,768 to 32,767	  short s = 10000;
int	            4 bytes	    from -2^31 to 2^31-1	  int i = 123456;
long	        8 bytes	    from -2^63 to 2^63-1	  long l = 123456789L;
float	        4 bytes     with 6-7 decimal digits	  float f = 3.14f;
double	        8 bytes	    up to 15 decimal digits	  double d = 3.14159;
char	        2 bytes	    16-bit Unicode character  char c = 'A';
boolean	        1 bit	    true or false	          boolean ex = true;

Exaples:
public class Main {
    public static void main(String[] args) {
        int num = 25;               // int data type
        float price = 10.99f;       // float data type
        char letter = 'A';          // char data type
        boolean isJavaFun = true;   // boolean data type
        
        System.out.println("Number: " + num);
        System.out.println("Price: " + price);
        System.out.println("Letter: " + letter);
        System.out.println("Is Java fun? " + isJavaFun);
    }
}

b) Non-Primitive (Reference) Data Types
Non-primitive data types, also known as reference types, refer to objects and store the memory address (or reference) of the object they point to, rather than the object itself. They are derived from classes and can be user-defined or Java's built-in classes like String, Arrays, etc.

# Types of Non-Primitive Data Types:
a) Strings
b) Arrays
c) Classes
d) Interfaces
e) Enums

# Default Values of Data Types
Data Type	                Default Value
byte	                         0
short	                         0
int             	             0
long	                         0L
float	                         0.0f
double	                         0.0d
char	                         '\u0000'
boolean	                         false
Object	                         null


# Type Casting in Java
Type casting is the process of converting one data type into another.

Two Types of Type Casting:
2. Implicit Casting (Widening Conversion): Automatic conversion of smaller data types to larger data types.
int a = 100;
long b = a;  // Implicit casting from int to long

2. Explicit Casting (Narrowing Conversion): Manual conversion of larger data types to smaller data types.
double d = 9.99;
int i = (int) d;  // Explicit casting from double to int

*/

public class B_Datatypes {
    public static void main(String[] args) {
        System.out.println("Datatypes in Java");

        // Advanced type casting primitive to non-primitive
        int a = 12;
        int x = 5;
        String b = String.valueOf(a);
        System.out.println(a + 12);
        System.out.println(b + 12);
        
        // non-primitive to primitive
        String c = "12";
        int d = Integer.parseInt(c);
        System.out.println(d + 12);
        System.out.println(c + 12);

        // increment and decrement(unary operator)
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++x);

        // Shift operator (Right shift >> = 5/2^shift) and (left shift << = 5*2^shift)
        System.out.println(5 >> 2);
        System.out.println(5 << 3);
    }
}