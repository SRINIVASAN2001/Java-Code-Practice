class EvenOrOdd
{
	static void EvenOddSum(int n)
	{
		int Evensum=0,Oddsum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				Evensum+=i;
			}
			else
			{
				Oddsum+=i;
			}
		}
		System.out.println("The Even Numbers are:"+Evensum);
		System.out.println("The Odd Numbers are:"+Oddsum);
		int Totalsum=Evensum+Oddsum;
		System.out.println("The Total Sum Of Numbers are:"+Totalsum);
	}
	public static void main(String[] args)
	{
		System.out.println("********");

		EvenOddSum(100);
	
		System.out.println("********");
	}

}
