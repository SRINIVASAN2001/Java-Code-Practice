package programmming;

public class DigitArmstrong
{
	public static void main(String[] args)
	{
		int num=10;
		String str=Integer.toString(num);
		int len =str.length();
		
		int sum=0;
		
		for (int i = 0; i < str.length(); i++)
		{
			int digit=Character.getNumericValue(str.charAt(i));
			
			sum+=(int)Math.pow(digit,len);
			
		}
		System.out.println(sum);
	}	
}	
