import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      
      String st=sc.nextLine();
      String str="chn";
      
      if(st.contains(str))
      {
        for(int i=st.length()-1;i>=3;i--)
        {
          System.out.print(st.charAt(i));  
        }
      }
      else
      {
        System.out.println("Nothing");
      }
      
    }
}
