package Arrays;

import java.util.Arrays;

public class mergeNonduplicatedarray
{
	private static int[] isMerge(int[] arr1, int[] arr2)
	{
		int pos=0;
		int[] merge=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			merge[pos++]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			merge[pos++]=arr2[j];
		}
		
		for (int i = 0; i < merge.length; i++) {
			for (int j = i+1; j < merge.length; j++) {
				if(merge[i]>merge[j])
				{
					int temp=merge[i];
					merge[i]=merge[j];
					merge[j]=temp;
				}
			}
		}
		return merge;
	}
	private static int[] isDuplicate(int[] arr1)
	{
		int n=arr1.length;
		for(int i=0;i<n;i++)
		{
			if(arr1[i]!=0)
			{	
				for(int j=i+1;j<n;j++)
				{
					if(arr1[i]==arr1[j])
					{
						int pos=j;
						
						while(pos<arr1.length-1)
						{
							arr1[pos]=arr1[pos+1];
							pos++;
						}
						arr1[arr1.length-1]=0;
					}
				}
			}	
		}
		
		int count=0;
		for(int ele:arr1)
		{
			if(ele!=0)
			{
				count++;
			}	
		}
		
		int[] brr = new int[count];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr1[i];
		}
		return brr;
		
	}
	public static void main(String[] args)
	{
		int[] arr1= {1,2,2,3,4,5,5};
		int[] arr2={2,6,3,2,2,4,7};
		
		arr1=isDuplicate(arr1);
		arr2=isDuplicate(arr2);
		
		int[] merge=new int[arr1.length+arr2.length];
		merge=isMerge(arr1,arr2);
		
		System.out.println(Arrays.toString(arr1));
		
	}	
}
