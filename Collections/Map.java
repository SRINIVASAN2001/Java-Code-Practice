package Collections;
import java.util.*;
import java.util.Map.Entry;

public class Map1 
{
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1,"Srini");
		map.put(2,"Akash");
		map.put(3,"Bharath");
		map.put(4,"Colon");
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map.values());
		System.out.println(map.containsKey(1));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println("----------------------");
		
		Set<Integer> keys =map.keySet();
		for(Integer key:keys)
		{
			System.out.println(map.get(key));
			
		}
		
		System.out.println("----------------------");
		
		
		for(Entry<Integer,String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+ "==>" + entry.getValue());
		}
		
		
	}	
}
