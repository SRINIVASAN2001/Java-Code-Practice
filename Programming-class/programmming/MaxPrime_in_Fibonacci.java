package programmming;
import java.util.*;

public class MaxPrime_in_Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Fibonacci Series:");
		int num=sc.nextInt();
		
		while(num>=0)
		{
			int fib=fibonacci(num);
			
			if(isPrime(fib))
			{
				System.out.println("The Largest prime number of fibonacci series is: "+fib);
				break;
			}	
			else
			{
				num--;
			}
		}
	}
	
	static int fibonacci(int num)
	{
		int n=num;
		
		if(n==1)
		{
			return 0;
		}
		else if(n==2 || n==3)
		{
			return 1;
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	static boolean isPrime(int fib)
	{
		int count=0;
		
		int temp=fib;
		for(int i=1;i<=temp;i++)
		{
			if(temp%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
