import java.util.*;
class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		long num=sc.nextLong();
		
		while(num>0)
		{
			long rem = num%10;
			System.out.print(rem);
			num=num/10;

		}
				
	}
}