import java.util.Scanner;
import java.util.Arrays;

public class solution
{
  public static void main (String[] args)
  {
    int[] arr ={2,5,4,1,6};
    
      InsertionSort(arr);
    
    for(int i:arr)
    {
      System.out.print(i+" ");
    }
  }
  
  public static void InsertionSort(int[] arr)
  {
    for(int i=1;i<arr.length;i++)
    {
      int temp=arr[i];
      int j=i-1;
      
      while(j>=0 && arr[j]>temp)
      {
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=temp;
    }
  }
}
