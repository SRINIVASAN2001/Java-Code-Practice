public class pattern
{
    public static void main(String[] args)
    {
      int n=7;
      
      for(int i=1;i<=n;i++)
      {
        for(int s=1;s<i;s++)
        {
          System.out.print("  ");
        }
    
        for (int j = i; j<=n; j++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
}
