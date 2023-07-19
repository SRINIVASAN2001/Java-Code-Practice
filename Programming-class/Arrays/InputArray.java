package Arrays;

import java.util.*;

public class InputArray
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		
		for (int i = 0; i < arr.length; i++)
		{
			for(int j=0;j<arr[col].length;j++)
			{
				arr[i][j]=sc.nextInt();sc.nextLine();
			}
		}
		
		System.out.println(Arrays.deepToString(arr));

	}

}
