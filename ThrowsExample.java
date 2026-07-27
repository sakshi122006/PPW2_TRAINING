/* 8. Throws Keyword
**Case Study:**
A file management system opens a text file to read its contents. Since the file may not exist, 
the method should declare that it can throw an exception.

**Question:**
Write a Java program that reads a file using a method declared with the 'throws' keyword and 
handles the exception in the calling method.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {

    // Method declared with throws keyword
    static void readFile() throws FileNotFoundException {
        File file = new File("sample.txt"); // File should exist in the project folder
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    public static void main(String[] args) {

        try {
            readFile(); // Calling method
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        System.out.println("Program Ended.");
    }
}