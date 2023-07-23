package String;
import java.util.*;

public class Anagram
{
	public static void main(String[] args)
	{
		String s1="madam";
		String s2="damam";
	
		String res="";
				
		if(s1.length()==s2.length())
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
				
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("True");
			}
		else
		{
			System.out.println("Length is not matching");
		}
	}
}
	}
