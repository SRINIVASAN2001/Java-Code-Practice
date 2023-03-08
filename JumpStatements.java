import java.util.*;
class JumpStatements
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		System.out.println("********Break**********");
		
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			if(i>=3)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		System.out.println("********Continue**********");
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			if(i>=3)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}
}