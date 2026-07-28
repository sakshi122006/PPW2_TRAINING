/*Q1. Basic Thread Creation**
Write a Java program that creates two threads — one printing even numbers (1–20) and the other 
printing odd numbers (1–20) — by extending the `Thread` class.
*Concepts: extending Thread, `run()`, `start()`**/
class even extends Thread
{
	public void run()
	{
		for(int i =0; i<=20;i+=2)
		{
			System.out.println("Even number"+ i);
		}
	}
}
class odd extends Thread
{
	public void run()
	{
		for(int i =1; i<=20;i+=2)
		{
			System.out.println("Odd number"+ i);
		}
	}
}

public class Basic_thread{
public static void main(String[] args){
	even t1 = new even();
	odd t2 = new odd();
	t1.start();
	t2.start();
}
}