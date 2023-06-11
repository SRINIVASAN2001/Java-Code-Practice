import java.util.Scanner;

public class Solution
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Movie[] movie=new Movie[4];
    
    for(int i=0;i<movie.length;i++)
    {
      String movieName=sc.nextLine();
      String producingCompany=sc.nextLine();
      String genre=sc.nextLine();
      int budget=sc.nextInt();sc.nextLine();
      
      
      movie[i]=new Movie(movieName,producingCompany,genre,budget);
    }
    String search = sc.nextLine();
    sc.close();
  
    Movie[] newMovie = budgetForGivenMovie(movie,search);
  
    for(int i=0;i<newMovie.length;i++)
    {
      if(newMovie[i].getBudget()>80000000)
      {
        System.out.println("High Budget Movie");
      }
      else
      {
        System.out.println("Low Budget Movie");
      }
    
    }
  }
  
  private static Movie[] budgetForGivenMovie(Movie[] t,String Genre)
  {
    int c=0;
    for(int i=0;i<t.length;i++)
    {
      if(t[i].getGenre().equals(Genre))
      {
        c++;
      }
    } 
    
    int d=0;
    Movie[] m = new Movie[c];
    for(int i=0;i<t.length;i++)
    {
      if(t[i].getGenre().equals(Genre))
      {
        m[d]=t[i];
        d++;
      }
    }
    return m;
  }
}
class Movie
{
  private String movieName;
  private String producingCompany;
  private String genre;
  private int budget;
  
  public Movie(String movieName,String producingCompany,String genre,int budget)
  {
    this.movieName=movieName;
    this.producingCompany=producingCompany;
    this.genre=genre;
    this.budget=budget;
  }

  public String getMovieName()
  {
    return movieName;
  }
  
  public String getProducingCompany()
  {
    return producingCompany;
  }
  
  public String getGenre()
  {
    return genre;
  }
  
  public int getBudget()
  {
    return budget;
  }
}