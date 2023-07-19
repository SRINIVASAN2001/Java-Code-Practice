package Arrays;
import java.util.*;

public class Maximum_element_2d {

	public static void main(String[] args)
	{
		int[][] arr= {{2,6,7},{1,9,3},{5,3,5}};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		System.out.println("The Maximum element in the array is: "+max);
	}

}
