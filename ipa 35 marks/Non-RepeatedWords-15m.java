import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String:");
      String str = sc.nextLine();
      char[] ch=str.toCharArray();
      
      Set<Character> Uniquewords = new LinkedHashSet<>();
      
      for(char ele:ch)
      {
        if(!Uniquewords.contains(ele))
        {
          Uniquewords.add(ele);
        }
      }
      
     
      System.out.println(Uniquewords);
    }
}
