import java.util.Scanner;
import java.util.Arrays;

public class solution
{
  public static void main (String[] args)
  {
    int[] arr ={1,2,3,4,5,6,7,8,9};
    Scanner sc= new Scanner(System.in);
    int target=sc.nextInt();
    
    //int res=Arrays.binarySearch(arr,target);
    int res=BinarySearch(arr,target);
    if(res==-1)
    {
      System.out.println("not Element found At :"+" "+res);
    }
    else
    {
     System.out.println("Element Found:"+" "+res); 
    }
  }
  
  private static int BinarySearch(int[] arr,int target)
  {
    int low=0;
    int high=arr.length-1;
    
    while(low <= high)
    {
      int middle=low+(high-low)/2;
      int value=arr[middle];
      System.out.println("Middle Element: "+value);
      
      if(value<target)
      {
        low=middle+1;
      }
      else if(value>target)
      {
        high=middle-1;
      }
      else
      {
        return middle;
      }
    }
    return -1;
  }
  
 
}
