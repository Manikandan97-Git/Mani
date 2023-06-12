package manikandan.java;

import java.util.*;

 class Mobiles {
	
	String brand ;
	String model;
	String version;
	 int year;
	 
	 
	 
 public  Mobiles(String brand, String model, String version, int year ){
	this.brand = brand;
	this.model = model;
	this.version = version;
	this.year = year;
	}
	 
public String getBrand() {
		return brand;
	}
	
	
	public String getModel() {
		return model;
	}
	
	public String getVersion() {
		return version;
	}
	
	public int getYear() {
		return year;
	}

 }  
 public class Mobile_task {
  public static void main (String [] args) {
	  List <Mobiles> mobiles = new ArrayList<Mobiles>();
	
	  
	  
	  
	  mobiles.add(new  Mobiles("Oppo", "A11 ", "Android 11 ", 2015));
	  mobiles.add(new Mobiles("Oppo", "Pro", "Android 12", 2016));
	  mobiles.add(new  Mobiles("Oppo", "Y20", "Android 13", 2017));
	  mobiles.add(new  Mobiles ("Oppo", "Reno", "Android 14", 2018));
	  mobiles.add(new  Mobiles ("Oppo", "Reno", "Android 14", 2019));
	  
	  for(Mobiles mobile : mobiles ) {
		  if(mobile.getBrand()=="Oppo") {
			  System.out.println( mobile.getBrand());
			  System.out.println( mobile.getModel());
			  System.out.println( mobile.getVersion());
			  System.out.println( mobile.getYear());
			  
			  
		  }
	  }
	
//	  for (byte i = 0; i < mobiles.size(); i++) {
//		  if(mobiles.get(i).toString() == M1){
//			  
//			  if()
//			  
//			  System.out.println(M1);
//			 // break;
//		  }
//		 
//	  }
//	  
	  
  }
 }
	  


  
  

  
	 
	 
	
	
	
	
       

