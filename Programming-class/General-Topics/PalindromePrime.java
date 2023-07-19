package programmming;

public class PalindromePrime
{
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
		int[] arr={22,69,232,45,99};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{
				count++;
			}
		}
		System.out.println("The Count of Palindrome:"+count);
	}
}
