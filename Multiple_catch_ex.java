/*5. Multiple Catch Blocks

**Case Study:**
A scientific calculator performs arithmetic operations and accesses arrays. 
Different runtime errors may occur while executing the program.

**Question:**
Write a Java program that demonstrates the use of multiple 'catch' blocks to handle 
'ArithmeticException', 'ArrayIndexOutOfBoundsException', and any other unexpected exceptions.*/
public class Multiple_catch_ex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
		try {
            System.out.println(arr[6]);
			int num=arr[2]/0;
        } catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
            System.out.println("ERORR!!!!!!");
        }
    }
    
}