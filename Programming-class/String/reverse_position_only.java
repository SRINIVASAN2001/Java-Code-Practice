package String;

public class reverse_position_only
{
	public static void main(String[] args)
	{
		String s1="This is my program";
		
		String[] str=s1.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			
			System.out.print(str[i]+" ");
			
		}
	//System.out.println(s2);	
	}

}
