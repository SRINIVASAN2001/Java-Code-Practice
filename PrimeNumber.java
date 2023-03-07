import java.util.*;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		int count=0;
		
		System.out.println("************");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The Given Number is a Prime Number:"+ num);
		}
		else
		{
			System.out.println("The Given Number is not an Prime Number:"+ num);
		}
		
		
		System.out.println("************");
	}


	
}