/*Q3. Write a Java program to create a Vector of fruits. Remove one fruit using remove() and display 
the remaining elements using an Iterator.*/
import java.util.*;
public class VECTOR_3 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Fruits.");
        for(int i=0;i<3;i++)
        {
            v.add(sc.next());
        }
        System.out.println("Enter the fruit to remove:");
        String fruitToRemove = sc.next();
        v.remove(fruitToRemove);
        System.out.println("after removing fruits are:");
        Iterator<String> it = v.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}