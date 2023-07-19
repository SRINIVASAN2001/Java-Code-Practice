
package programmming;

public class HexatoBinary
{
	public static void main(String[] args)
	{
		int num=960;
		
		char[] ch= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		String res="";
		
		while(num>0)
		{
			int rem=num%16;  
			System.out.println(rem);
			res=res+ch[rem];
			num=num/16;
		}
		System.out.println(res);	
	}
}
