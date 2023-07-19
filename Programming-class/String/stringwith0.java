package String;

public class stringwith0 
{
	public static void main(String[] args)
	{
		String s1="12345";
		String s2="";
		int c=48;//ascii of 0=48
		
		
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i)+(char)(c);
		}
		System.out.println(s2);
		
	}

}
