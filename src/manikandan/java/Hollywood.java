package manikandan.java;
import java.util.*;


  class Actors{
	  String actor;
	  String movie;
	  String genre;
	  int year;
	  
	  
	public  Actors(String actor, String movie, String genre, int year) {
		this.actor = actor;
		this.movie = movie;
		this.genre = genre;
		this.year = year;
		
	}
	  public String getActor() {
		  return actor;
	}
	  public String getMovie() {
		  return movie;
    }
	  public String getGenre() {
		  return genre;
    }
	  public int getYear() {
		  return year;
    }
	  
	  @Override
	  public String toString() {
		  return "Actor Name : "  +  actor + " " + "Movie Name : " + movie +" "+ "Genre : " + genre +" "+ "Year : " + year;
	  }
	  
    }
  
  
    public class Hollywood {
    	public static void main (String [] args) {
    		List<Actors> actors = new ArrayList <Actors>();
    		
    		actors.add(new Actors("Tom Cruise", "Mission Impossible","Action", 2019));
    		actors.add(new Actors("Tom Cruise", "TopGun Maverick","Adventure", 2019));
    		actors.add(new Actors("Tom Cruise", "The Mummy","Mystery", 2019));
    		actors.add(new Actors("Tom Cruise", "Jack Reacher","Thriller", 2019));
    		actors.add(new Actors("Tom Cruise", "Oblivion","Sci-Fic", 2019));
    		
    		for(Actors act: actors) {
    			if(act.getMovie()== "TopGun Maverick") {
    				System.out.println(act.toString());
    			}
    		}
    		
    		
    	}

}
