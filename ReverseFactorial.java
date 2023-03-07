class ReverseFactorial
{
	static void factorial(int n)
	{
		int fact=1;
		for(int i=n; i>=1; i--)
		{
			fact*=i;
		}
		System.out.println("The Factorial is:"+fact);
	}
	public static void main(String[] args)
	{
		System.out.println("************");
		
		factorial(5);

		System.out.println("************");
	}
}

