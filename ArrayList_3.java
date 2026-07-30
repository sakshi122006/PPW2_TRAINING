/*Q3. Write a Java program to create an ArrayList of cities. Remove one city using remove(), 
check whether a city exists using contains(), and display the list. */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_3 {
    public static void main(String[] args) {

        //2nd pgrm
    
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Cities.");
        for(int i=0;i<5;i++)
        {
            al.add(sc.next());
        }
        System.out.println(al);
        System.out.println("Enter name of city to remove");
        String name =sc.next();
        boolean res= al.contains(name);
        if(res ==true )
        {
            al.remove(name);
        }
        else
        {
            System.out.println("Makad");
        }
        System.out.println("Cities after remove."+al);
        
    }
}
