package programmming;

public class Largestpalindrome
{
	public static int SmallestestPalindrome(int[] arr)
	{
		int max=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{	
				if(arr[i]<max)
				{
					max=arr[i];
				}
			}	
		}
		return max;
		
	}

	public static int LargestPalindrome(int[] arr)
	{
		int min=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{	
				if(arr[i]>min)
				{
					min=arr[i];
				}
			}	
		}
		return min;
	}
	public static boolean isPalindrome(int num)
	{
		int temp=num;
		int sum=0;
		while(num>0)
		{
			
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;			
		}
		if(temp==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {22,69,232,45,99};
		
		int res1=LargestPalindrome(arr);
		int res2=SmallestestPalindrome(arr);
		
		System.out.println("LargestPalindrome:"+res1);
		System.out.println("SmallestPalindrome:"+res2);
	}
}
