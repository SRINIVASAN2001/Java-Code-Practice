package Exception;

import java.util.Scanner;

public class Throws
{
	void verification(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Enter the valid age");
		}
		else
		{
			System.out.println("You're eligible");
		}
	}
	
	public static void main(String[] args)
	{
		Throws obj = new Throws();
		try 
		{
			obj.verification(17);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
