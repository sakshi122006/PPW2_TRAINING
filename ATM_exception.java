/*6. Finally Block
Case Study: ATM Transaction
Case Study:
An ATM system allows customers to withdraw money from their accounts. During the transaction, 
an exception may occur due to an invalid operation, such as wrong withdrawal amount entered. 
Regardless of whether the transaction succeeds or fails, the ATM must always display a message 
indicating that the session has ended and the user's card can be removed.

Question:
Write a Java program that simulates an ATM transaction using try, catch, and finally. 
Ensure that the finally block always executes to display the message "Session ended. Please collect your card."
*/
import java.util.Scanner;

public class ATM_exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 2000;

        System.out.println("Current Balance: " + balance);
        System.out.print("Enter amount to withdraw: ");
        int amt = sc.nextInt();

        try {
            if (amt <= 0) {
                throw new Exception("Invalid withdrawal amount.");
            }

            if (amt > balance) {
                throw new Exception("Insufficient balance.");
            }

            balance = balance - amt;
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: " + balance);

        } catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {
            System.out.println("Session ended. Please collect your card.");
        }

        sc.close();
    }
}