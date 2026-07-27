/*9. Custom Exception

**Case Study:**
A CET admission system requires students to obtain **at least 40 marks** to qualify for admission. 
If the marks are below the minimum requirement, a custom exception should be raised.

**Question:**
Write a Java program to create a custom exception named 'InvalidMarksException'. 
Throw the exception when the student's marks are less than 40.*/
import java.util.Scanner;
public class Custom_exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cet marks:");
        int cet= sc.nextInt();

        try {
            if (cet < 40) {
                throw new Exception("InvalidMarksException");
            }
			else
			{
			System.out.println(" You are eligible for Admission");
			}
			

        } catch (Exception e) {
            System.out.println("NOT APPLICABLE " + e.getMessage());

        } finally {
            System.out.println("THANK YOU ");
        }

        sc.close();
    }
}