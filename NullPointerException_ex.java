/*3. Null Pointer Exception

**Case Study:**
An employee management system stores employee names. Due to missing data, 
an employee name may be 'null'. The system should handle such situations without terminating.

**Question:**
Write a Java program that attempts to access a null string and handles the 'NullPointerException'.*/
public class NullPointerException_ex
{
	public static void main(String[] args)
	{
		String e1 ="Rahul";
		String e2 = null;
		try
		{
			System.out.println("employee e2 "+e2.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("Nullpointer exception");
		}
	}
}
