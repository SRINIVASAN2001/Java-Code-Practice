package String;

public class FirstLetterUppercase
{
	public static void main(String[] args)
	{
		String s1="this is my program";
		String s2="";
		String[] arr = s1.split(" ");
		
		for(String ele:arr)
		{
			String word=ele;
			char ch=word.charAt(0);
			
			s2=s2+(char)(ch-32);
			s2+=word.substring(1,word.length());
			s2=s2+" ";
		}
		System.out.println(s2);
		
		
	}

}
