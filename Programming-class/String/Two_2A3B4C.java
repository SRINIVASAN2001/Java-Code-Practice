package String;

public class Two_2A3B4C
{
	public static void main(String[] args)
	{
		String str="2A3B4C";
		
		String number=""; //234
		String character=""; //ABC
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{	
		
				number+=ch;
			}
			else
			{
				character+=ch;
			}
		}
		String res="";
		for(int i=0;i<character.length();i++)
		{
			int n=Character.getNumericValue(number.charAt(i));
			for(int j=0;j<n;j++)
			{
				res+=character.charAt(i);
			}
		}
		
		System.out.println(res);
		
	}
}
