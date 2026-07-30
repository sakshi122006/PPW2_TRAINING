import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_2 {
    public static void main(String[] args) {

        //2nd pgrm
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 no.");
        for(int i=0;i<5;i++)
        {
            al.add(sc.nextInt());
        }
        System.out.println("First element of list "+al.get(0));
        System.out.println("");

        al.set(1,200);
        System.out.println("New Element at 1 " + al.get(1));

        System.out.println("Whole list "+al);
        al.add(1,90);
        System.out.println("Whole list "+al);
    }
}