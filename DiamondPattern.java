class DiamondPattern
{
	public static void main(String[] args)
	{
		
		System.out.println("**********-Diamond-Pattern-**********");
		
		for(int i=1;i<=5;i++)
		{
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}	
			for(int j=1;j<=2*i-1;j++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=4;i>=1;i--)
		{
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}	
			for(int j=1;j<=(2*i-1);j++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("**************-Alphabet******************");
		
		for(int i=1;i<=5;i++)
		{
			int p='A';
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}	
			for(int j=1;j<i;j++)
			{
				System.out.print((char)p++ +" ");
					
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p-- +" ");
			}
			
			
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			int p='A';
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}	
			for(int j=1;j<i;j++)
			{
				System.out.print((char)p++ +" ");
					
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p-- +" ");
			}
			
			
			System.out.println();
		}
		
		System.out.println("**************-Numbers-******************");
		
		for(int i=1;i<=5;i++)
		{
			int p=1;
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}	
			for(int j=1;j<i;j++)
			{
				System.out.print(p++ +" ");
					
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(p-- +" ");
			}
			
			
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			int p=1;
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}	
			for(int j=1;j<i;j++)
			{
				System.out.print(p++ +" ");
					
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(p-- +" ");
			}		
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("***********-Alphabet-Diagonal-Pattern-************");
		System.out.println("\n");
		for(int i=1;i<=7;i++)
		{
			int p='A';
			int ch='G';
			for(int j=1;j<=7;j++)
			{
				if(i==j)
				{
					System.out.print((char)p+" ");
				}
				else if(i+j==7+1)
				{
					System.out.print((char)ch+" ");
				}
				else
				{
					System.out.print("  ");
				}
				p++;
				ch--;
				
			}
			System.out.println();
		}
		
		System.out.println("***********-Alphabet-Diagonal-Pattern-************");
		
		for(int i=1;i<=7;i++)
		{
			int p='A';
			for(int j=1;j<=7;j++)
			{
				if(i==j||i+j==7+1)
				{
					System.out.print((char)p+" ");
				}
				else
				{
					System.out.print("  ");
				}
				p++;
			}
			System.out.println();
		}
		
		
	}
	
	
	
}