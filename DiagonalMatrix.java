import java.util.*;
class SquareMatrix
{
	public static void main(String[] args)
	{
		System.out.println("***********");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{ 
				if(i==j||i+j==n+1)
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
		
		System.out.println("----------------");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{ 
				if(i==n/2+1||j==n/2+1)
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
		
		System.out.println("-----------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{ 
				if(i==j||i+j==n+1||i==n/2+1||j==n/2+1)
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
		System.out.println("-----------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{ 
				if(i==1||j==1||i==n||j==n||i==j||i+j==n+1||i==n/2+1||j==n/2+1)
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