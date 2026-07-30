/*Q4. Write a Java program to create a Vector of strings. Check whether a given element exists using contains(), 
display the total number of elements using size(), and print all elements using an Iterator.*/
import java.util.*;
public class VECTOR_4 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Fruits.");
        for(int i=0;i<3;i++)
        {
            v.add(sc.next());
        }
        System.out.println("Enter the fruit to check:");
        String fruitToCheck = sc.next();
        if(v.contains(fruitToCheck))
        {
            System.out.println("Fruit is present.");
        }
        else
        {
            System.out.println( " Mental not present");
        }
        System.out.println("Total number of fruits: " + v.size());
        Iterator<String> it = v.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}