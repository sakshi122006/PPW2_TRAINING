/*Q5. Write a Java program to create an ArrayList of colors. Display all elements using an Iterator, 
then remove all elements using clear() and check whether the list is empty. */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayList_5 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Colors.");
        for(int i=0;i<3;i++)
        {
            al.add(sc.next());
        }
        Iterator<String> it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(al);
        al.clear();
        System.out.println(al);
        
    }
}
