package Arrays;

import java.util.*;

public class MergeArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		int[] arr1 = new int[n1];
		
		System.out.println("Enter the element:");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Enter the number:");
		int n2=sc.nextInt();
		int[] arr2 = new int[n2];
		
		System.out.println("Enter the element:");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		int[] merge = new int[arr1.length + arr2.length];
		
		int pos=0;
		for(int i=0;i<arr1.length;i++)
		{
			merge[pos++]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			merge[pos++]=arr2[j];
		}
		
		int temp=0;
		for (int i = 0; i < merge.length; i++) {
			for (int j = i+1; j < merge.length; j++) {
				if(merge[i]>merge[j])
				{
					temp=merge[i];
					merge[i]=merge[j];
					merge[j]=temp;
				}
			}
		}
		
		System.out.println("The Sorted merge array is:");
		System.out.println(Arrays.toString(merge));
	}

}
