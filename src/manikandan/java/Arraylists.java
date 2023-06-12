package manikandan.java;
import java.util.*;
public class Arraylists {
    int x ;
    int y;
    
    public Arraylists(int x, int y){
        this. x = x;
        this.y = y;
        }
        @Override
        public String toString (){
        return "X : " + x  + "\nY : " + y;
        }
        
  public static void main(String[] args) {
    List<Arraylists> list = Arrays.asList(new Arraylists(10 , 15), new Arraylists(20,20), new Arraylists (30,50));
    for(int i = 0; i < list.size(); i++){
       System.out.println(list.get(i).toString());
       System.out.println();
    
    
    } 
  }
}
