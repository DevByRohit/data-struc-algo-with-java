/*

Q. Java Naming Conventions
Ans. Naming conventions in Java help make the code more readable and maintainable by following a consistent style. These conventions are crucial for understanding the purpose of variables, classes, methods, and other elements in the code. Here's a breakdown of the standard naming conventions in Java.

1. Class Names
a) Convention: Use PascalCase (also known as UpperCamelCase).
b) Guideline: Class names should be nouns and descriptive.
Example: Employee, BankAccount, Vehicle

public class BankAccount {
    // class implementation
}


2. Interface Names
a) Convention: Use PascalCase, similar to class names.
b) Guideline: Interface names should usually describe capabilities or behaviors.
Example: Runnable, Serializable, Cloneable

public interface Serializable {
    // interface methods
}


3. Method Names
a) Convention: Use camelCase.
b) Guideline: Method names should be verbs or verb phrases that describe the action being performed.
Example: getName(), calculateSalary(), sendEmail()

public String getName() {
    return name;
}


4. Variable Names
a) Convention: Use camelCase.
b) Guideline: Variable names should be meaningful and self-explanatory. Short and descriptive names are preferred.
Example: totalAmount, employeeName, currentBalance
int totalAmount = 5000;
String employeeName = "John";

5. Constant Names
a) Convention: Use UPPERCASE letters with words separated by underscores.
b) Guideline: Constants should be declared as static final and typically represent fixed values.

Example: MAX_VALUE, PI, DEFAULT_TIMEOUT
public static final int MAX_VALUE = 100;


6. Package Names
a) Convention: Use all lowercase letters, with words separated by dots.
b) Guideline: Package names should be unique, typically starting with the domain name in reverse to avoid conflicts.

Example: com.companyname.projectname, org.example.utilities
package com.company.project;


7. Type Parameter Names (Generics)
a) Convention: Use single uppercase letters.
b) Guideline: Type parameters are typically short and use a single letter. Common ones include T for type, E for element, K for key, and V for value.

Example: <T>, <K, V>
public class Box<T> {
    private T item;
}



8. Enum Names
a) Convention: Use PascalCase for the enum type name and UPPERCASE for enum constants.
b) Guideline: Enum constants typically represent fixed sets of related constants, like days of the week, months, etc.

Example: Day.MONDAY, Status.SUCCESS
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

9. Annotation Names
a) Convention: Use PascalCase.
b) Guideline: Annotations should describe the behavior or information they represent.

Example: @Override, @Deprecated
@Override
public void someMethod() {
    // method implementation
}


10. Boolean Variables
a) Convention: Prefix with is, has, can, or should.
b) Guideline: Boolean variables should represent a condition or state.
Example: isActive, hasPermission, canExecute
boolean isActive = true;
boolean hasPermission = false;

Que. Why Follow Naming Conventions?
a) Readability: Clear, consistent names make the code easier to read and understand.

b) Maintainability: Well-named classes, methods, and variables are easier to maintain and modify.

c) Consistency: Following standard conventions ensures that code is consistent across teams and projects, making it easier for developers to collaborate.

Summary:

Java Naming Conventions
Element         Convention	                Example
Class	        PascalCase	                BankAccount, Employee
Interface	    PascalCase	                Serializable, Runnable
Method	        camelCase	                getName(), calculateSalary()
Variable	    camelCase	                employeeName, totalAmount
Constant	    UPPERCASE	                MAX_VALUE, PI
Package	        lowercase	                com.company.project
Generic Type    Single Uppercase	        <T>, <K, V>
Enum	        PascalCase & UPPERCASE	    Status.SUCCESS, Day.MONDAY
Annotation	    PascalCase	                @Override, @Deprecated
Boolean	        is/has/can/should	        isActive, hasPermission


*/

public class B_Naming_Conventions {
    public static void main(String[] args) {
        System.out.println("Naming conventions");
    }
}
