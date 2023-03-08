class SingleDigitConversion
{
	public static void main(String[] args)
	{
		int num=12345;
		while(num>10)
		{
			int sum =0;
			while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			num=sum;
		}	
		System.out.println("Coversion of Number into single Digit is :"+ num);
	}
}