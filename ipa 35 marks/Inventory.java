import java.util.Scanner;

public class Solution
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Inventory[] inventory = new Inventory[4];
		
		for(int i=0;i<inventory.length;i++)
		{
			int a = sc.nextInt();sc.nextLine();
			int b = sc.nextInt();sc.nextLine();
			int c = sc.nextInt();sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
			
			inventory[i]= new Inventory(a,b,c,d); 
		}
		
		int limit = sc.nextInt();
		sc.close();
		
		Inventory[] newinventory = replenish(inventory,limit);
		for(int i=0;i<newinventory.length;i++)
		{
			if(newinventory[i].getThreshold()>=75)
			{
				System.out.println(newinventory[i].getInventoryId()+" Critical Filling");
			}
			else if(newinventory[i].getThreshold() <= 74 && newinventory[i].getThreshold() >= 50)
			{
				System.out.println(newinventory[i].getInventoryId()+" Moderate Filling");
			}
			else
			{
				System.out.println(newinventory[i].getInventoryId()+" Non-Critical Filling");
			}
		}
	}
	
	public static Inventory[] replenish(Inventory[] inventory,int limit)
	{
		int c=0;
		for(int i=0;i<inventory.length;i++)
		{
			if(inventory[i].getThreshold()<=limit)
			{
				c++;
			}
		}
		
		int d=0;
		Inventory[] m = new Inventory[c];
		for(int i=0;i<m.length;i++)
		{
			if(inventory[i].getThreshold()<=limit)
			{
				m[d]=inventory[i];
				d++;
			}
		}
		return m;
	}

}

class Inventory
{
	private int inventoryId;
	private int maximumQuantity;
	private int currentQuantity;
	private int threshold;
	
	
	Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
		super();
		this.inventoryId = inventoryId;
		this.maximumQuantity = maximumQuantity;
		this.currentQuantity = currentQuantity;
		this.threshold = threshold;
	}


	public int getInventoryId() {
		return inventoryId;
	}


	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}


	public int getMaximumQuantity() {
		return maximumQuantity;
	}


	public void setMaximumQuantity(int maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}


	public int getCurrentQuantity() {
		return currentQuantity;
	}


	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}


	public int getThreshold() {
		return threshold;
	}


	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}	
}
