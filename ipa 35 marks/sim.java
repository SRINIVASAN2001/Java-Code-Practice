import java.util.Scanner;

public class Solution
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Sim[] sim = new Sim[5];
    
    for(int i=0;i<sim.length;i++)
    {
      int a = sc.nextInt();sc.nextLine();
      String b = sc.nextLine();
      double c = sc.nextDouble();sc.nextLine();
      double d = sc.nextDouble();sc.nextLine();
      String e = sc.nextLine();
      
      sim[i]= new Sim(a,b,c,d,e);
    }
    
    String circle1=sc.nextLine(); 
    String circle2=sc.nextLine();
    Sim[] result=transferCustomerCircle(sim,circle1,circle2);
    
    for(Sim s:result)
    {
      System.out.println(s.getSimID()+" "+s.getCustomerName()+" "+s.getCircle()+" "+s.getRatePerSecond());
    }
  }
  
  public static Sim[] transferCustomerCircle(Sim[] t,String circle1,String circle2)
  {
    int c=0;
    for(Sim s:t)
    {
      if(s.getCircle().equals(circle1))
      {
        c++;
      }
    }
    
    Sim[] result = new Sim[c];
    int d=0;
    for(Sim s:t)
    {
        if(s.getCircle().equals(circle1))
        {
          s.setCircle(circle2);
          result[d]=s;
          d++;
        }
    }
    
    for(int i=0;i<result.length;i++)
    {
      for(int j=0;j<i;j++)
      {
        if(result[i].getRatePerSecond()>result[j].getRatePerSecond())
        {
          Sim temp = result[i];
          result[i]=result[j];
          result[j]=temp;
        }
      } 
    }
    return result;
    
  }
}
class Sim
{
  private int simId;
  private String customerName;
  private double balance;
  private double ratePerSecond;
  private String circle;
  
  Sim(int simId,String customerName,double balance,double ratePerSecond,String circle)
  {
    this.simId=simId;
    this.customerName=customerName;
    this.balance=balance;
    this.ratePerSecond=ratePerSecond;
    this.circle=circle;
  }
  
  public int getSimID()
  {
    return simId;
  }
   public String getCustomerName()
  {
    return customerName;
  }
   public double getBalance()
  {
    return balance;
  }
   public double getRatePerSecond()
  {
    return ratePerSecond;
  }
   public String getCircle()
  {
    return circle;
  }
  public void setCircle(String circle)
  {
    this.circle=circle;
  }
}


/*1
raj
100
1.5
KOL
2
chetan
200
1.6
AHD
3
asha
150
1.7
MUM
4
kiran
50
2.2
AHD
5
vijay
130
1.8
AHD
AHD
KOL
*/
