package programmming;
import java.util.Scanner;
public class DigitArmstrong
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num=sc.nextInt();
		
		String str=Integer.toString(num);
		int len =str.length();
		
		int sum=0;
		
		for (int i = 0; i < str.length(); i++)
		{
			int digit=Character.getNumericValue(str.charAt(i));
			
			sum+=(int)Math.pow(digit,len);
			
		}
		System.out.println(sum);
	}	
}	
