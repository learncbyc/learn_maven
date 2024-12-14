# learn_maven
Learn Maven Commit By Commit

# Simple Java Program

This repository contains a simple Java program that prints "Hello, World!" to the console.

## Steps to Compile

1. Open a terminal or command prompt.
2. Navigate to the directory containing the `HelloWorld.java` file.
3. Run the following command to compile the program:
   ```
   javac HelloWorld.java
   ```

## Steps to Execute

1. After successful compilation, a `HelloWorld.class` file will be generated in the same directory.
2. Run the program using the following command:
   ```
   java HelloWorld
   ```

## Steps to Create a JAR File

1. Create a manifest file (e.g., `manifest.txt`) with the following content:
   ```
   Main-Class: HelloWorld
   ```
   Ensure there is a blank line at the end of the file.

2. Run the following command to create a JAR file:
   ```
   jar cfm HelloWorld.jar manifest.txt HelloWorld.class
   ```

## Steps to Execute the JAR File

1. Run the JAR file using the following command:
   ```
   java -jar HelloWorld.jar
   ```

## Files to Watch

- `HelloWorld.java`: The main Java file containing the program code.
- `HelloWorld.class`: The compiled bytecode file created after compilation.
- `HelloWorld.jar`: The JAR file created for executing the program.
- `manifest.txt`: The manifest file specifying the entry point for the JAR file.

