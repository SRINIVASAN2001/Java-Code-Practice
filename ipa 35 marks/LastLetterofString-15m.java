import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:");
      String str = sc.nextLine();
      
      String s="";
      
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)==' ')
        {
          s+=str.charAt(i-1);
        }
      }
      s+=str.charAt(str.length()-1);
      System.out.println(s);
    }
        }
