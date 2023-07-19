package String;

public class reverse_Same_position
{
	public static void main(String[] args)
	{
		String s1="This is my program";
		String res="";
		
		String[] str=s1.split(" ");
		
		for(int i=0;i<=str.length-1;i++)
		{
			String reverse="";
			String word=str[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				reverse+=word.charAt(j);
			}
			res=res+reverse+" ";
		}
		System.out.println(res);
	}

}
