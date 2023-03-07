import java.util.*;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
	
		int sum=0,temp=num;
	
		while(num>0)
		{
			int rem=num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is an Armstrong Number");
		}
		else
		{
			System.out.println(temp+" is not an Armstrong Number");
		}
	}	
}