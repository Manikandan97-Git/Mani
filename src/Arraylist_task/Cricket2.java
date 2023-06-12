package Arraylist_task;
import java.util.*;
 
class Team {
	String country;
	String player;
	int highScore;
	float average;
	
	public Team(String country, String player, int highScore, float average) {
		this.country = country;
		this.player = player;
		this.highScore = highScore;
		this.average = average;
		
	}
       public String getCountry() {
    	   return country;
       }
       
       public String getPlayer() {
    	   return player;
       }
       
       public int getHighScore() {
    	   return highScore;
       }
       
       public float getAverage() {
    	   return average; 
    	   
       }
       @Override
   	public String toString() {
   		return "Country Name : " + country + " " + "Player Name : " + player +" " +" High Score : " + " " + highScore +" "+"Average : " + average ;
      }
}

public class Cricket2 {
	public static void main(String [] args) {
		
		List<Team> team = new ArrayList<Team>();
		
		team.add(new Team("India", "Virat Kohli", 183 , 60.34f));
		team.add(new Team ("Australia","Steve Smith", 150, 50.50f));
		team.add(new Team("England", "Joe Root", 143 , 40.11f));
		team.add(new Team("Australia", "Marnus Labuchagne", 120 , 55.70f));
		team.add(new Team("New Zealand", "Kane Williamson", 120 , 45.13f));
		team.add(new Team ("India","KL Rahul", 100, 25.99f));
		team.add(new Team("England", "Harry Brook", 115 , 45.27f));
		team.add(new Team("India", "Sachin Tendulkar", 200 , 70.30f));
		
		
		
		
		Scanner scanner = new Scanner(System.in) ;
		
		 System.out.println("What is your fvt player average");
		 float av = scanner.nextFloat();
			
			for (Team player : team) {
				
				 
				if(player.getAverage()>=av) {
					System.out.println(player.toString());
				
					}
				
					
		}
			}
}

