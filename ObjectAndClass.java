import java.util.*;
class Fan
{
	int Blades =3;
	static String Colour="Brown";
	int SpeedLimit=100;
	
	static void Rotation()
	{
		System.out.println("Fan is used to rotate");
	}
	
	void SwitchON()
	{
		System.out.println("Now your fan is Turned ON");
	}
	
	static int Speed(int num )
	{
		int ch=num;
		switch(ch)
		{
			case 1:
				System.out.println("Your Fan Speed is now set to 1");
				break;
			case 2:
				System.out.println("Your Fan Speed is now set to 2");
				break;
			case 3:
				System.out.println("Your Fan Speed is now set to 3");
				break;
			case 4:
				System.out.println("Your Fan Speed is now set to 4");
				break;	
			default:
				System.out.println("Enter the Speed Between 1-4");
				break;
		}
		return ch;
		
	}
	
}


class MainClass
{
		public static void main(String[] args)
		{
			System.out.println("************");
			
			System.out.println("Total Number of Blades:"+ new Fan().Blades);
			System.out.println("Fan Speed Limit is:" + new Fan().SpeedLimit+"kmph");
			System.out.println("Fan Colour is:"+ Fan.Colour);
			
			Fan.Rotation();
			
			new Fan().SwitchON();
			
			Fan.Speed(3);
			
			
			System.out.println("************");
		}
}
