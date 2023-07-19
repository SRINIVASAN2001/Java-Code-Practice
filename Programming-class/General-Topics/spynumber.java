package programmming;
import java.util.*;

public class spynumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int sum=0,prod=1;
		int num=sc.nextInt();
		
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			prod*=rem;
			num=num/10;
		}
		
		if(sum==prod)
		{
			System.out.println("Its a Perfect Spy number");
		}
		else
		{
			System.out.println("Not a spy number");
		}
	}
}
