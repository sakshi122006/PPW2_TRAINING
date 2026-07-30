/*Q4. Write a Java program to create an ArrayList of strings. Find the index of a given element using 
indexOf(), display the size of the list using size(), and check whether the list is empty using isEmpty().*/
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Cities.");
        for(int i=0;i<3;i++)
        {
            al.add(sc.next());
        }
        System.out.println("Index of string"+al.indexOf("a"));

        System.out.println("Size of arraylist "+al.size());
        System.out.println("arraylist is empty or not  "+al.isEmpty());
        System.out.println(al);
        
    }
}
