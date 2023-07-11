import java.util.*;
public class Solution
{
  public static void main (String[] args) {
    List<Integer> list =Arrays.asList(1,4,9,1,5,7,4);
    int len=list.size();
    System.out.println(len);
    
    
    int k=1;
    
    Set<Integer> c = new TreeSet<>();
  
    for(int ele:list)
    {
      c.add(ele);     
    }
    
    for(int ele:c)
    {
      System.out.println(ele);
    }  
  }
}
