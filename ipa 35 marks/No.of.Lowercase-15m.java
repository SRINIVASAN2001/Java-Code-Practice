import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:");
      String in =sc.nextLine();
      char[] ch =in.toCharArray();
      int count=0;
      
      for(int i=0;i<in.length();i++)
      {
        if(Character.isLowerCase(ch[i]))
        {
          count++;
        }
      }
      System.out.println(count);
    }
}
