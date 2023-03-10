import java.util.*;
class RecursionProgram
{
	static int Factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			return n*Factorial(n-1);
		}
	}
	
	static void Reverse(int n)
	{
		if(n>0)
		{
			System.out.print(n%10);
			Reverse(n/10);
		}
	
	}
	
	static int Fibonacci(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2||n==3)
		{
			return 1;
		}
		else
		{
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
			
	}
	
	static void Print(int num)
	{
		if(num<=10)
		{
			System.out.println("The Value:"+num);
			num++;
			Print(num);
		}	
	}	
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		System.out.println("********************");
		
		int x=Factorial(n);
		System.out.println("The Factorial="+x);
		System.out.println("********************");
		
		int y=Fibonacci(n);
		System.out.println("The Fibonacci="+y);
		System.out.println("********************");
		
		Reverse(1234);
		
		System.out.println("\n********************");
		Print(1);
		
		
		
		System.out.println("********************");
		
	}
}