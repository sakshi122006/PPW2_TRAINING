/*Q1. Write a Java program to create a Vector of employee names. Add 5 names and display them using an 
Iterator.*/
import java.util.*;
public class VECTOR_1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 employee names.");
        for(int i=0;i<3;i++)
        {
            v.add(sc.next());
        }
        Iterator<String> it = v.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
