/*Q2. Runnable Interface**
Rewrite Q1 using the `Runnable` interface instead of extending `Thread`. 
Explain why implementing `Runnable` is generally preferred over extending `Thread`.
*Concepts: Runnable vs Thread, multiple inheritance limitation**/
class even implements Runnable
{
	public void run()
	{
		for(int i =0; i<=20;i+=2)
		{
			System.out.println("Even number"+ i);
		}
	}
}
class odd implements Runnable
{
	public void run()
	{
		for(int i =1; i<=20;i+=2)
		{
			System.out.println("Odd number"+ i);
		}
	}
}

public class Runnable_thread{
public static void main(String[] args){
	Thread t1 = new Thread(new even());
	Thread t2 = new Thread(new odd());
	t1.start();
	t2.start();
}
}