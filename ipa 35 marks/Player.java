import java.util.Scanner;

public class Solution
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Player[] player = new Player[4];
    
    for(int i=0;i<player.length;i++)
    {
      int a = sc.nextInt();sc.nextLine();
      String b = sc.nextLine();
      int c = sc.nextInt();sc.nextLine();
      int d = sc.nextInt();sc.nextLine();
      int e = sc.nextInt();sc.nextLine();
      
      player[i]= new Player(a,b,c,d,e);
    }
    
    int target=sc.nextInt();
    double[] avgRunRate=findAverageScoreOfPlayers(player,target);
    
    for(int i=0;i<avgRunRate.length;i++)
    {
      if(avgRunRate[i]>=80.0)
      {
        System.out.println("Grade A Player");
      }
      else if(avgRunRate[i]<=79.0 && avgRunRate[i]>=50.0)
      {
        System.out.println("Grade B Player");
      }
      else
      {
        System.out.println("Grade C Player");
      }
    }
  }
  
  public static double[] findAverageScoreOfPlayers(Player[] t,int target)
  {
    int c=0;
    for(int i=0;i<t.length;i++)
    {
      if(t[i].getNoofMatchesPlayed()>=target)
      {
        c++;
      }
    }
    
    double averageRunRate=0.0;
    double[] m = new double[c];
    
    for(int i=0;i<m.length;i++)
    {
      averageRunRate=Double.valueOf(t[i].getTotalRunsScored()/t[i].getNoofMatchesPlayed());
      m[i]=averageRunRate;  
    }
    return m;
  }
}
class Player
{
  private int playerId;
  private String playerName;
  private int iccRank;
  private int noofMatchesPlayed;
  private int totalRunsScored;
  
  Player(int playerId,String playerName,int iccRank,int noofMatchesPlayed,int totalRunsScored)
  {
    this.playerId=playerId;
    this.playerName=playerName;
    this.iccRank=iccRank;
    this.noofMatchesPlayed=noofMatchesPlayed;
    this.totalRunsScored=totalRunsScored;
  }
  
  public int getPlayerId()
  {
    return playerId;
  }
   public String getPlayerName()
  {
    return playerName;
  }
   public int getIccRank()
  {
    return iccRank;
  }
   public int getNoofMatchesPlayed()
  {
    return noofMatchesPlayed;
  }
   public int getTotalRunsScored()
  {
    return totalRunsScored;
  }
}
