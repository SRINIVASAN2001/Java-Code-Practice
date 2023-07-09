package ipa;
import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Footwear[] footwear = new Footwear[5];
		
		for(int i=0;i<footwear.length;i++)
		{
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			
			footwear[i]=new Footwear(a,b,c,d);
		}
		
		String type=sc.nextLine();
		String name=sc.nextLine();
		sc.close();
		
		int res1=getCountByType(footwear,type);
		if(res1>0)
		{
			System.out.println(res1);
		}
		else
		{
			System.out.println("No FootWear Found");
		}
		
		Footwear price=getSecondHighestPriceByName(footwear,name);
		if(price==null)
		{
			System.out.println("Footwear not available");
		}
		else
		{
			System.out.println(price.getFootwearId());
			System.out.println(price.getFootwearName());
			System.out.println(price.getFootwearType());
		}
		
		
	}

	private static int getCountByType(Footwear[] t, String type)
	{
		int count=0;
		for (int i = 0; i < t.length; i++)
		{
			if(t[i].getFootwearType().equals(type))
			{
				count++;
			}
		}
		return count;
	}
	
	private static Footwear getSecondHighestPriceByName(Footwear[] footwear, String name)
	{
		int c=0;
		for (int i = 0; i < footwear.length; i++)
		{
			if(footwear[i].getFootwearName().equals(name))
			{
				c++;
			}
		}
		
		Footwear[] m =new Footwear[c];
		int d=0;
		
		for (int i = 0; i < footwear.length; i++)
		{
			if(footwear[i].getFootwearName().equals(name))
			{
				m[d]=footwear[i];
				d++;
			}
			
		}
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i].getPrice() > m[j].getPrice())
				{
					Footwear temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
		
		if(m.length>0)
		{
			Footwear price = m[m.length-2];
		
			return price;
		}
		return null;
	}
}

class Footwear
{
	private int footwearId;
	private String footwearName;
	private String footwearType;
	private int price;
	public Footwear(int footwearId, String footwearName, String footwearType, int price) {
		super();
		this.footwearId = footwearId;
		this.footwearName = footwearName;
		this.footwearType = footwearType;
		this.price = price;
	}
	public int getFootwearId() {
		return footwearId;
	}
	public void setFootwearId(int footwearId) {
		this.footwearId = footwearId;
	}
	public String getFootwearName() {
		return footwearName;
	}
	public void setFootwearName(String footwearName) {
		this.footwearName = footwearName;
	}
	public String getFootwearType() {
		return footwearType;
	}
	public void setFootwearType(String footwearType) {
		this.footwearType = footwearType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


/*
103
reebok
running shoes
56777
102
reebok
running shoes
67888
101
reebok
running shoes
45000
104
reebok
sports
5600
105
reebok
running shoes
10000
running shoes
reebok
*/
