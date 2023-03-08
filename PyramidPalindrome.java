class PyramidPalindrome
{
	public static void main(String[] args)
	{
		int odd=1;
		for(int i=1;i<=4;i++)
		{
			for(int s=7;s>i;s--)
			{
				System.out.print("  ");
			}
			
			int k=0;
			for(int j=1;j<=odd;j++)
			{
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k+" ");
				
			}
			System.out.println();
			odd+=2;
		}
		
	}
}