package Arrays;

import java.util.*;

public class duplicatelement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{	
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						int pos=j;
						
						while(pos<arr.length-1)
						{
							arr[pos]=arr[pos+1];
							pos++;
						}
						arr[arr.length-1]=0;
					}
				}
			}	
		}
		
		int count=0;
		for(int ele:arr)
		{
			if(ele!=0)
			{
				count++;
			}	
		}
		
		int[] brr = new int[count];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr[i];
		}
		
		System.out.println(Arrays.toString(brr));
		
	}

}
