import java.util.*;
class AlphabetMatrix
{
	public static void main(String[] args)
	{
		System.out.println("***********");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{ 
				
				if(i==1||i==n||i==n/2+1)
				{
					System.out.print("* ");
				}
				else if(i<n/2+1 && j==1 || i>n/2+1 && j==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
}	