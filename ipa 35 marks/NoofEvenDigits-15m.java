import java.util.*;

public class Main
    public static void main(String[] args)
    {
      
      int n =53278;
      
      
      int rem=0;
      int count= 0;
      
      
      while(n>0)
      {
        rem=n%10;
        if(rem%2==0)
        {
          count++;
        }
        n=n/10;
      }
      System.out.println(count);
    }
      }
