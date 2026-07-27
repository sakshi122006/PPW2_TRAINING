/*# 4. Number Format Exception

**Case Study:**
An online banking system accepts the account number as numeric input. 
If a user enters alphabetic characters instead of numbers, the system should display an error.

**Question:**
Write a Java program to convert a string into an integer using 'Integer.parseInt()'. 
Handle the 'NumberFormatException' for invalid input.*/

public class NumberFormatException_ex {
    public static void main(String[] args) {
        String account = "aa122a";
		try {
            int result =Integer.parseInt("account");
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Wrong account number");
        }
    }
    
}