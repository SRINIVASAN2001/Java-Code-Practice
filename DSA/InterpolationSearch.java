import java.util.Scanner;
import java.util.Arrays;

public class solution
{
  public static void main (String[] args)
  {
    int[] arr ={1,2,3,4,5,6,7,8,9};
    Scanner sc= new Scanner(System.in);
    int value=sc.nextInt();
    
    int res=InterpolationSearch(arr,value);
    if(res==-1)
    {
      System.out.println("not Element found At :"+" "+res);
    }
    else
    {
     System.out.println("Element Found:"+" "+res); 
    }
  }
  
  private static int InterpolationSearch(int[] arr,int value)
  {
    int low=0;
    int high=arr.length-1;
    
    while(value>=arr[low] && value<=arr[high] && low<=high)
    {
      int probe= low+(high-low)* (value-arr[low])/(arr[high]-arr[low]);
      System.out.println("Probe Element: "+value);
      
      if(arr[probe]==value)
      {
        return probe;
      }
      else if(probe<value)
      {
        low=probe+1;
      }
      else
      {
        high=probe-1;
      }
    }
    return -1;
  }
 
}
