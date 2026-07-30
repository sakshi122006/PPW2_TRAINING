/*Q2. Write a Java program to create a Vector of integers. Retrieve an element using get(), update it using set(), 
and display all elements using an Iterator. */
import java.util.*;
public class VECTOR_2 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers.");
        for(int i=0;i<3;i++)
        {
            v.add(sc.nextInt());
        }
        System.out.println("Element at index 1: " + v.get(1));
        v.set(1, 100);
        
        Iterator<Integer> it = v.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
