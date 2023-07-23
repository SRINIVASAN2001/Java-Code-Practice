import java.util.*;
public class Main
{
  public static boolean check(String str)
  {
    Stack<Character> s=new Stack<Character>();
    
    boolean res=true;
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if(ch=='{')
      {
        s.push(ch);
      }
      else
      {
        if(s.empty())
        {
          res=false;
          break;
        }
        else
        {
          s.pop();
        }
      }
    }
    return s.empty();
    
  }
  public static void main(String[] args)
  {
    String str="{{{}}";
    
    boolean res=check(str);
    
    if(res)
    {
      System.out.println("Balanced");
    }
    else
    {
      System.out.println("Unbal"); 
    }
    
  }   
}
