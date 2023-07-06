import java.util.Scanner;

public class solution
{
  public static void main (String[] args)
  {
    int[] arr ={2,6,8,1,4,3};
    Scanner sc= new Scanner(System.in);
    int value=sc.nextInt();
    
    int res=LinearSearch(arr,value);
    if(res>0)
    {
      System.out.println("Element found At:"+res);
    }
    else
    {
     System.out.println("No Element Found"); 
    }
  }
  
  private static int LinearSearch(int[] arr,int value)
  {
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==value)
      {
        return 1;
      }
    }
    return -1;
  }
}