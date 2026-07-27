/*# 2. Array Index Out of Bounds Exception

**Case Study:**
A school management system stores student marks in an array. 
Sometimes, a user requests the marks of a student whose index does not exist.

**Question:**
Write a Java program to access an array element based on the user's index. 
Handle the 'ArrayIndexOutOfBoundsException' by displaying an appropriate message.
*/
public class ArrayOutof {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 92, 88}; // Array of student marks
        int index = 5; // User requested index (out of bounds)

        try {
            int mark = studentMarks[index]; // Attempt to access the array element
            System.out.println("Student mark at index " + index + ": " + mark);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds. Please enter a valid index between 0 and " + (studentMarks.length - 1) + ".");
        }
    }
}