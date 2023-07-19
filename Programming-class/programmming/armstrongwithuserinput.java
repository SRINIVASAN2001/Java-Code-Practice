package programmming;

public class armstrongwithuserinput {
	public static boolean isArmstrong(int num) {
		int temp=num;
		int x=num;
		int count=0;
		int sum=0;
		while(x>0)
		{
			x=x/10;
			count++;
			//x=x/10;
		}
		System.out.println(count);
		while(num>0) 
		{
			int prod=1;
			int last=num%10;
			for(int i=1;i<=count;i++)
			{
				prod=prod*last;
			}
			sum=sum+prod;
			num=num/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}
public static void main(String[] args)
{
	
	
	if(isArmstrong(153))
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not");
	}
}
}
