package manikandan.java;

public class Haltingmethod {


  public static void main (String [] args) {
		     int result = hhhh(6,8);
		     System.out.println("result :"+result);
		     }
		     public static int hhhh(int start,int end){
		     if(end > start){
		    	 
		     int num = end + hhhh(start, end - 1);
		     int sumOf = hhhh(start, end - 1);
		     System.out.println("sumof "+sumOf);
		      System.out.println("num "+num);
		      return num;
		     }else{
		     return end;
		     }
		     }
		}
