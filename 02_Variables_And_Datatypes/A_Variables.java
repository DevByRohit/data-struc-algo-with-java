/*

# Just like we have some rules that we follow to speak english, we have some rules to follow white writing a Java Program. The set of these rules is called Syntax.

1. Variables in Java
In Java, a variable is a container that holds data that can be changed during the execution of a program. It is a symbolic name that represents some memory location.


1. Variable Declaration
Syntax:
data_type variable_name;
int myVariable;  ---> Declaration

2. Variable Initialization
variable_name = value;
age = 25;       ---> Initialization

3. Variable Declaration and Initialization Together
int year = 2024; ---> Declaration and initialization together


+++++++++++++++++ Rules for daclaring variables ++++++++++++++++++++++++
The name of a variable (also called an identifier) must follow these rules:
1. Start with a letter, $, or _: Variable names must begin with a letter (uppercase or lowercase), a dollar sign ($), or an underscore (_). Variable names cannot begin with a digit.
Examples:
int age;         // Valid
int $salary;     // Valid
int _count;      // Valid
int 9items;      // Invalid, starts with a digit

2. Subsequent characters: After the first character, the variable name can contain letters, digits, underscores, or dollar signs.
Examples:
int count9;      // Valid
int num_5;       // Valid

3. No spaces: Variable names cannot contain spaces.
Examples:
int employee age; // Invalid, space between 'employee' and 'age'

4. Case Sensitivity: Variable names are case-sensitive, meaning "age" and "Age" are different variables.
Examples:
int age = 25;
int Age = 30;

5. No reserved keywords: You cannot use Java reserved keywords as variable names, such as int, class, for, if, etc.
Examples:
int class; // Invalid, 'class' is a reserved keyword



+++++++ Types of Variables +++++++++++
# Java variables are categorized into three main types:

1. Local Variables:
Declared inside a method, constructor, or block.
Only accessible within the method or block in which it is declared.
No default value: Must be initialized before use.

Example:
public class Main {
    public void display() {
        int localVariable = 10;  // Local variable
        System.out.println(localVariable);
    }
}

2. Instance Variables:
Declared inside a class but outside any method, constructor, or block.
Each instance of the class has its own copy of the instance variable.
Default value: Initialized to default values if not explicitly initialized.

Example:
public class Main {
    int instanceVariable;  // Instance variable
    public void display() {
        System.out.println(instanceVariable);  // Default value is 0 for integers
    }
}


3. Static Variables (Class Variables):
a) Declared using the static keyword inside a class.
b) Shared among all instances of the class.
c) Default value: Like instance variables, static variables are initialized to default values if not explicitly initialized.

Example:
public class Main {
    static int staticVariable = 100;  // Static variable
    public void display() {
        System.out.println(staticVariable);
    }
}

*/
public class A_Variables {
    public static void main(String[] args) {
        int age; // Declaration
        age = 25; // Initialization
        int year = 2024; // Declaration and initialization together

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
    }
}