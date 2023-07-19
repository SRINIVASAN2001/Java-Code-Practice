package Arrays;
import java.util.*;

public class ArrayRightrotate
{
	 public static void main(String[] args)
	 {    
		        
		 		try (Scanner sc = new Scanner(System.in))
		 		{
					int [] arr ={1, 2, 3, 4, 5};     
					int n = sc.nextInt();    
					   
   
					System.out.println("Original array: ");    
					for (int i = 0; i < arr.length; i++)
					{     
					    System.out.print(arr[i] + " ");     
					}      
					    
      
					for(int i = 0; i < n; i++)
					{    
					    int j, last;    
					    
					    last = arr[arr.length-1];    
					    
					    for(j = arr.length-1; j > 0; j--)
					    {    
					         
					        arr[j] = arr[j-1];    
					    }    
					      
					    arr[0] = last;    
					}    
					
					System.out.println();    
					     
					System.out.println("Array after right rotation: ");    
					for(int i = 0; i< arr.length; i++)
					{    
					    System.out.print(arr[i] + " ");    
					}
				}    
	   }    
		   

}
