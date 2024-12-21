# learn_maven
Learn Maven Commit By Commit

# Simple Java Program

This repository contains a simple Java program that prints "Hello, World!" to the console.

## Steps to Compile

1. Open a terminal or command prompt.
2. Navigate to the directory containing the `HelloWorld.java` file.
3. Ensure that all the required JAR files (e.g., Joda-Time, Apache Commons Lang) are placed in the `lib` folder.
4. Run the following command to compile the program, including the JAR files in the `lib` folder:
   ```
   javac -cp "lib/*" com/learncbyc/learnmaven/HelloWorld.java
   ```
- `-cp "lib/*"`: This option includes all the JAR files in the `lib` folder in the classpath during compilation.

## Steps to Execute

1. After successful compilation, a `HelloWorld.class` file will be generated in the same directory.
2. Run the program using the following command:

   ```
   java -cp "lib/*:." com/learncbyc/learnmaven/HelloWorld
   ```
- `-cp "lib/*:."`: This option includes all the JAR files from the `lib` folder and the current directory (`.`) in the classpath when running the program. (Use `;` instead of `:` on Windows.)

## Steps to Create a JAR File (Including Fat JAR)

1. Create a manifest file (e.g., `manifest.txt`) with the following content:
   ```
   Main-Class: com.learncbyc.learnmaven.HelloWorld
   ```
   Ensure there is a blank line at the end of the file.

2. Extract all dependencies (JAR files) to a temporary directory (`extracted_lib`):
   a. Create the extraction directory:
      ```
      mkdir -p extracted_lib
      ```
   b. Extract all JAR files in the `lib` folder into the `extracted_lib` directory:
      ```
      for jar in lib/*.jar; do
         unzip -q "$jar" -d extracted_lib/
      done
      ```

3. Package the JAR with the compiled class and dependencies:
   ```
   jar cfm HelloWorld.jar manifest.txt -C . com/learncbyc/learnmaven/HelloWorld.class -C extracted_lib .
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
