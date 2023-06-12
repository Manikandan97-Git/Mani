package manikandan.java;
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

public class Cricket {
	public static void main(String [] args) {
		
		List<Team> team = new ArrayList<Team>();
		
		team.add(new Team("India", "Virat Kohli", 183 , 60.99f));
		team.add(new Team ("Australia","Steve Smith", 150, 50.99f));
		team.add(new Team("England", "Joe Root", 143 , 60.99f));
		team.add(new Team("Australia", "Marnus Labuchagne", 120 , 60.99f));
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("what is your team ");
		 String teamName = scanner.nextLine();
			
			for (Team player : team) {
				
				 
				if(player.getCountry().equals(teamName)) {
					System.out.println(player.toString());
		
			
				}
				
			}
		}

}

	
	
