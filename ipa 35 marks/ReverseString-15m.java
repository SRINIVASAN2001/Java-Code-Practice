import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:");
      String str = sc.nextLine();
      String[] ss = str.split(" ");
      StringBuffer sb;
      String temp="";
     
      for(int i=0;i<ss.length;i++)
      {
         temp+=new StringBuffer(ss[i]).reverse()+" ";
         
      }
      
      System.out.println(temp);
    }
           }
