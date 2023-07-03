import java.util.Arrays;

public class seperatezero {

	public static void main(String[] args) 
	{
		int counter=0;
		int [] arr = {0,10,48,53,0,76,8,0,65};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[counter]=arr[i];
				counter++;
			}
		}
		while(counter<arr.length)
		{
			arr[counter]=0;
			counter++;
		}
		for(int sep : arr)
		{
		System.out.println("the seperated array is : "+sep);
		}
		
		System.out.println(Arrays.toString(arr));
	
	}

}
