package programmming;

import java.util.Arrays;

public class countprime
{
	
	public static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
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
	public static void main(String[] args) {
		
		int[] arr = {7,16,8,13,27};
		
		System.out.println(Arrays.toString(arr));
		
		int count=0,sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				count++;
				sum+=arr[i];
			}
		}
		int avg=sum/count;
		
		System.out.println("Count of Prime Number:"+count);
		System.out.println("Average of Prime number:"+avg);
		System.out.println("Sum of Prime number:"+sum);
	}
	

}
