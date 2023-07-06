import java.util.Scanner;
import java.util.Arrays;

public class solution
{
  public static void main (String[] args)
  {
    int[] arr ={2,5,4,1,6};
    
      SelectionSort(arr);
    
    for(int i:arr)
    {
      System.out.print(i+" ");
    }
  }
  
  public static void SelectionSort(int[] arr)
  {
    int temp=0;
    
    for(int i=0;i<arr.length-1;i++)
    {
      int min=i;
      for(int j=i+1;j<arr.length-1;j++)
      {
        if(arr[min]>arr[j])
        {
          min=j;
        }
      }
      temp=arr[i];
      arr[i]=arr[min];
      arr[min]=temp;
    }
  }
}
