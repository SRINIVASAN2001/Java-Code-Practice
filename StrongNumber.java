class StrongNumber
{
	static int fact(int num)
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args)
	{
		System.out.println("*************");
		
		int  num=145,temp=num,sum=0;
		while(num>0)
		{
			int rem =  num%10;
			sum = sum+fact(rem);
			num = num/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a Strong Number");
		else
			System.out.println("Not a Strong Number");		
		
		System.out.println("*************");
	}
}