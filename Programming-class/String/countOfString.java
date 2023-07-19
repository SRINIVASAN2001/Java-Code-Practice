package String;

public class countOfString
{
	public static void main(String[] args)
	{
		String str="PRO@123sriniFAAYIZ.com";
		int lower=0,upper=0,digit=0,special=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			else if(ch>='a' && ch<='z' )
			{
				lower++;
			}
			else if(ch>='0' && ch<='9')
			{
				digit++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Upper:"+upper);
		System.out.println("lower:"+lower);
		System.out.println("digit:"+digit);
		System.out.println("Special:"+special);
	}

}
