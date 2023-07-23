package String;

public class Panagram
{
	public static void method1(String str)
	{
		String res="";
		char[] ch=str.toLowerCase().toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				res=res+ch[i];
			}
		}
		System.out.println(res);
		
		boolean result=true;
		
		for(char i='a';i<='z';i++)
		{
			if(!res.contains(String.valueOf(i)))
			{
				result=false;
				break;
			}
		}
		
		if(result)
		{
			System.out.println("Panagram Word");
		}
		else
		{
			System.out.println("Not a Panagram Word");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		String string="Pack my box with five dozen liquor jugs";
		
		method1(string);
		
		method2(string);
	}
	
	public static void method2(String string)
	{	
		String str=string.toLowerCase();
		boolean res=true;
		char[] ch=new char[26];
		
		for(int i=0;i<str.length()-1;i++)
		{
			char c=str.charAt(i);
			if(Character.isAlphabetic(c))
			{
				int index=c-97;
				ch[index]=c;
			}			
		}
		for(char ele:ch)
		{
			if(ele==' ')
			{
				res=false;
				break;
			}
		}
		
		if(res)
		{
			System.out.println("Harrey yaar its an panagram bhaiyaa");
		}
		else
		{
			System.out.println("Veliya jaavoo");
		}
			
		
		
	}
}
