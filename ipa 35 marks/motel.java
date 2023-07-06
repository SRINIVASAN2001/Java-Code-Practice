import java.util.*;

public class Solution
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Motel[] motel=new Motel[4];
    
    for(int i=0;i<4;i++)
    {
      int a=sc.nextInt();sc.nextLine();
      String b=sc.nextLine();
      String c=sc.nextLine();
      int d=sc.nextInt();sc.nextLine();
      String e=sc.nextLine();
      double f=sc.nextDouble();
      
      motel[i]=new Motel(a,b,c,d,e,f);
    }
    
    String parameter=sc.nextLine();
    
    
    int res = totalNoOfRoomsBooked(motel,parameter);
    if(res>0)
    {
      System.out.println(res);
    }
    else
    {
      System.out.println("No Such Rooms Booked");
    }
  }  
  
  public static int totalNoOfRoomsBooked(Motel[] motel,String parameter)
  {
      int count=0;
      
      for(Motel mo:motel)
      {
        if(mo.getNoOfRoomsBooked()>5 && mo.getCabFacility().equalsIgnoreCase(parameter))
        {
          count=count+mo.getNoOfRoomsBooked();
        }
      }
      
      return count;
  }
    
}
class Motel
{
  int motelId;
  String motelName;
  String dateOfBooking;
  int noOfRoomsBooked;
  String cabFacility;
  double totalBill;
  
  Motel(int motelId,String motelName,String dateOfBooking,int noOfRoomsBooked,String cabFacility,double totalBill)
  {
    this.motelId=motelId;
    this.motelName=motelName;
    this.dateOfBooking=dateOfBooking;
    this.noOfRoomsBooked=noOfRoomsBooked;
    this.cabFacility=cabFacility;
    this.totalBill=totalBill;
  }
  
  public int getMotelId()
  {
    return motelId;
  }
  
  public String getMovieName()
  {
    return motelName;
  }
  public String getDateOfBooking()
  {
    return dateOfBooking;
  }
  public int getNoOfRoomsBooked()
  {
    return noOfRoomsBooked;
  }
  public String getCabFacility()
  {
    return cabFacility;
  }
  public double getTotalBill()
  {
    return totalBill;
  }
}
