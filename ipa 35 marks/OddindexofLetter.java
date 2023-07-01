import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:");
      String in =sc.nextLine();
      
      for(int i=0;i<in.length();i+=2)
      {
        System.out.println(in.charAt(i));
      }
    }
}
