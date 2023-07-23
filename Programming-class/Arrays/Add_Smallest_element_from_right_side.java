import java.util.*;

public class pattern
{
    public static void main(String[] args)
    {
      int[] arr={3,2,11,7,6,5,6,1};
      int n=arr.length;
      Stack<Integer> s=new Stack<>();
      
      s.push(arr[n-1]);
      arr[n-1]=-1;
      
      for(int i=n-2;i>=0;i--)
      {
        int x=arr[i];
        while(s.size()>0 && x<s.peek())
        {
          s.pop();
        }
        
        if(s.size()==0)
        {
          arr[i]=-1;
        }
        else
        {
          arr[i]=s.peek();
        }
        s.push(x);
      }
      System.out.println(Arrays.toString(arr));
     
    }
}
