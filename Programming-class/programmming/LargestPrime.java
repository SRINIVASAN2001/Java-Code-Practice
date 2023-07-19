package programmming;

public class LargestPrime
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
	public static int LargestPrime(int[] arr)
	{
		int min=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{	
				if(arr[i]>min)
				{
					min=arr[i];
				}
			}	
		}
		return min;
	}
	public static int SmallestPrime(int[] arr)
	{
		int max=Integer.MAX_VALUE;//max value= 2**32/2-1
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{	
				if(arr[i]<max)
				{
					max=arr[i];
				}
			}	
		}
		return max;
	}
	public static void main(String[] args)
	{
		
		int[] arr ={7,16,8,13,27};
 
		int res1=LargestPrime(arr);
		int res2=SmallestPrime(arr);
		
		
		System.out.println("Largest Prime number:"+res1);
		System.out.println("Smallest Prime number:"+res2);
	}	
	

}
