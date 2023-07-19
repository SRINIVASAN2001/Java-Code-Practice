package String;

public class convert_upper
{
	public static void main(String[] args)
	{
		String s1="programming";
		String s2="";
		
		for (int i = 0; i <s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch<='z' && ch>='a')
			{
				s2=s2+(char)(ch-32);
			}
			
		}
		System.out.println(s2);	
	}
}
