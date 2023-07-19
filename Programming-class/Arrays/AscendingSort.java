package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total element size: ");
		int n=sc.nextInt();
		int[] arr=new int[n]; 
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("The sorted array is: ");
		System.out.println(Arrays.toString(arr));
	}
}
