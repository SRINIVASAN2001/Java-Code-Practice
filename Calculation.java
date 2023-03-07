class Calculator
{
	static int Add(int a,int b)
	{
		int c;
		c= a+b;
		return c;
		
	}
	static int Mul(int a,int b)
	{
		int c;
		c= a*b;
		return c;
		
	}
	static int Sub(int a,int b)
	{
		int c;
		c= a-b;
		return c;
		
	}
	static int Div(int a,int b)
	{
		int c;
		c= a/b;
		return c;
		
	}

	static void Calc(int a,int b,String op)
	{
		int res = 0;
		switch(op)
		{
			case "Add":
				res=Add(a,b);
				System.out.println("The Addition of num:"+res);
				break;
			case "Mul":
				res=Mul(a,b);
				System.out.println("The Multiplication of num:"+res);
				break;
			case "Sub":
				res=Sub(a,b);
				System.out.println("The Subtraction of num:"+res);
				break;
			case "Div":
				res=Div(a,b);
				System.out.println("The Division of num:"+res);
				break;
			default:
				System.out.println("Enter the Right Choice");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("*************");
		Calc(5,4,"Add");
		
		System.out.println("*************");
	}
}