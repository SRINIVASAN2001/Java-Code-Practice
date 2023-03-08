import java.util.*;
class FibonacciSeries
{
	public static void main(String[] args)
	{
		
		System.out.println("*********************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Series Number:");
		int n =sc.nextInt();
		System.out.println("--------------------");
		System.out.println();
		
		int a=0,b=1,c=0;
		if(n==1)
		{
			System.out.print(a+" ");
		}
		else
		{
			System.out.print(a+" ");
			System.out.print(b+" ");
			n=n-2;
			
			while(n>0)
			{
				c=a+b;
				System.out.print(c+" ");
		
				a=b;
				b=c;
				n--;
			}
		}
		System.out.println("\n*****************");
	}	
}