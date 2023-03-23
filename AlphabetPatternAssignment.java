class AlphabetPatternAssignment
{
	public static void main(String[] args)
	{
		System.out.println("***********ASSIGNMENT-1***********");
		
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********ASSIGNMENT-2***********");		
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********ASSIGNMENT-3***********");
			
		char ch='A';	
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		System.out.println("***********ASSIGNMENT-4***********");		
		for(char i='A';i<='E';i++)
		{
			for(int s='E';s>i;s--)
			{
				System.out.print("  ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********ASSIGNMENT-5***********");	
		int odd=1;
		for(char i=1;i<=5;i++)
		{
			for(int s=7;s>i;s--)
			{
				System.out.print("  ");
			}
			
			char k='A';
			for(char j=1;j<=odd;j++)
			{
					if(j<=i)
					{
						k++;
					}
					else
					{
						--k;	
					}
					System.out.print(k+" ");
					
					
			}
			System.out.println();
			odd+=2;
		}
	}
}