package String;

public class GetZerosFromString
{
	public static void main(String[] args)
	{
		String s1="Programming@123.com";
		
		int s2=0;
		
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				s2+=(ch-48);
				
			}
		}
		System.out.println("Sum of Numbers:"+s2);
		
	}

}
