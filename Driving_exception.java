/*7. Throw Keyword
**Case Study:**
A driving license portal allows only applicants who are "18 years or older". If the applicant 
is underage, the system should explicitly generate an exception.

**Question:**
Write a Java program that checks the applicant's age. Use the 'throw' keyword to generate an exception 
if the age is below 18.*/
import java.util.Scanner;
public class Driving_exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception("Age is below 18");
            }
			else
			{
			System.out.println("License Aprooved");
			}
			

        } catch (Exception e) {
            System.out.println("NOT APPLICABLE" + e.getMessage());

        } finally {
            System.out.println("THANK YOU ");
        }

        sc.close();
    }
}