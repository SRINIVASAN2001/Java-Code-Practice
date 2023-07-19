package Arrays;

import java.util.*;

public class SplitSort
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len/2-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			for (int k =len/2; k < len-1; k++)
			{
				if(arr[k]>arr[k+1])
				{
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
