package programmming;

public class DigitArmstrong
{
	public static void main(String[] args)
	{
		int num=79;
		int temp=num;
		int count=0;
		int sum=1;
		while(temp>0)
		{
			int rem=temp%10;
			count++;
			temp=temp/10;
		}
		System.out.println(count);
		int res=isArm(num,count);
		System.out.println(res);
	}
	
	public static int isArm(int num,int count)
	{	
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			while(count>0)
			{	
				sum+=isFact(rem);
				count--;				
				num=num/10;
			}
			num=sum;
		}
		return sum;		
	}

	public static int isFact(int rem)
	{
		int fact=1;
		
		fact=fact+rem*rem;
		return fact;
	}	
}	
