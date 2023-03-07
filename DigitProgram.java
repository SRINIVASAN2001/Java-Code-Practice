import java.util.*;
class DigitProgram
{
	
	static int SumDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum = sum+rem;
			num = num/10;
		}
		return sum;
	}
	static int MulDigit(int num)
	{
		int mul=1;
		while(num>0)
		{
			int rem=num%10;
			mul = mul*rem;
			num = num/10;
		}
		return mul;
	}
	static int CountDigit(int num)
	{
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num = num/10;
		}
		return count;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("*************");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		System.out.println("*************");
		
		System.out.println("The Sum of Digit: "+SumDigit(num));
		System.out.println("The Mulplication of Digit: "+MulDigit(num));
		System.out.println("The Count of Digit: "+CountDigit(num));
				
		System.out.println("*************");
	}
}