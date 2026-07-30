/*Q5. Write a Java program to create a Vector of colors. Display all elements using an Iterator, 
remove all elements using clear(), and verify whether the vector is empty using isEmpty().*/
import java.util.*;
public class VECTOR_5 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Colors.");
        for(int i=0;i<3;i++)
        {
            v.add(sc.next());
        }
        Iterator<String> it = v.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
            v.clear();
            System.out.println("After clearing the vector: " + v);
            if(v.isEmpty())
            {
                System.out.println("Vector is empty.");
            }
            else
            {
                System.out.println("Vector is not empty.");
            }
        
    }
}