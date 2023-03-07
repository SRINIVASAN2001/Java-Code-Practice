import java.util.*;
class PyramidProgram
{
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int s=9;s>i;s--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}