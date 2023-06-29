package Thread;
import java.lang.Exception;
import java.util.Scanner;

class InterruptedException extends Exception
{
	InterruptedException()
	{
		System.out.println("invalid amount");
	}
	void check()
	{
		System.out.println("Enter a Correct amount");
	}
	
}


public class Userdefinedthread
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		double amt = sc.nextDouble();
		
		try
		{
			if(amt>0)
			{
				System.out.println("Transaction started");
			}
			else
			{
				throw new InterruptedException();
			}
		}
		catch (InterruptedException e)
		{
			e.check();
		}
	}

}
