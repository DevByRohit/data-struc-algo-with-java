/*

1. What is Programming?
Ans. Programming is the process of giving instructions to a computer to make it perform specific tasks. Think of it like writing a recipe: you provide step-by-step directions that tell the computer exactly what to do. These instructions are written in a special language that the computer can understand, such as Java, Python, or C++. By following the instructions, the computer can solve problems, run applications, or even play games.

2. JDK, JRE, and JVM: Understanding the Java Environment
When working with Java, you'll frequently come across three essential components: JDK (Java Development Kit), JRE (Java Runtime Environment), and JVM (Java Virtual Machine). Each plays a crucial role in the Java programming environment, and they are often used together. Let’s dive into the details of each.

a) JVM (Java Virtual Machine)
Ans. The JVM is an abstract machine that provides a runtime environment in which Java bytecode can be executed. It is platform-independent, meaning that the same Java bytecode can run on any device or operating system that has a compatible JVM.

Key Functions
1. Loads: JVM loads the Java bytecode into memory.
2. Verifies: JVM verifies the bytecode for security purposes.
3. Executes: JVM interprets or compiles the bytecode into machine code (native code) and executes it.
4. Memory Management: JVM manages memory through an automatic garbage collection process, cleaning up memory that is no longer in use.

Components of JVM
i. Classloader: Loads class files.
ii. Bytecode Verifier: Ensures the code adheres to JVM rules and is safe to execute.
iii. Interpreter: Converts bytecode to machine code, line by line.
iv. JIT Compiler: (Just-In-Time Compiler) Converts bytecode into native machine code for performance optimization.
v. Garbage Collector: Manages memory by automatically removing objects that are no longer in use.

b) JRE (Java Runtime Environment)
Ans. The JRE is a software package that provides the libraries, Java class libraries (Java API), and other components necessary to run applications written in Java. It includes the JVM but does not contain development tools like compilers or debuggers.

Key Functions
1. Runs Java Applications: JRE is used to execute Java programs. It provides the necessary environment to run bytecode produced by the Java compiler.
2. Includes JVM: The JRE contains the JVM along with the core libraries and other files needed to run Java applications.

c) JDK (Java Development Kit)
Ans. The JDK is a full-featured software development kit for Java developers. It includes the JRE, along with various development tools like the Java compiler (javac), JavaDoc, Java Debugger, and others necessary for developing Java applications.

Key Functions
1. Development: The JDK is used by developers to write, compile, and debug Java applications.
2. Tools: Includes development tools like:
i. javac: The Java compiler, which converts Java source code into bytecode.
ii. java: The command to run Java applications.
iii. javadoc: Generates API documentation from Java source code.
iv. jdb: Java debugger, used for debugging Java programs.


Practical Example
1. JDK in Action: As a developer, you write a Java program in a .java file. You use the JDK's javac tool to compile this file into bytecode (.class file).

2. JRE in Action: Once compiled, to run this program, you use the JRE, which contains the JVM and necessary libraries to execute the bytecode.

3. JVM in Action: The JVM interprets the bytecode and executes the program on your machine.
*/

/*
1. What is Java?
Ans. Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It was created by James Gosling and his team at Sun Microsystems (now owned by Oracle) in 1995. Java is known for its portability, security, and performance, making it one of the most widely used programming languages in the world.

Syntax:
public class className {
    public static void main(String[] args) {
        // Your Java code goes here
        System.out.println("Hello World!");
    }
}

Rules for the execution of java code
1. Save your Java code -> class name
2. Compile your Java code -> javac className.java
3. Run your Java code -> java className


# How java works
Java is compiled into the bytecode and then it is interpreted to machine code

Source code  ------> bytecode -------> Machine code

*/

public class A_WhatIsJava {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}