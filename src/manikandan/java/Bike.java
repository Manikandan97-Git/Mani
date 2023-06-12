package manikandan.java;

import java.util.*;

public class Bike {
	 
	String bikeName;
	  String model;
	  int year;
	  float mileage;
	  
	  @Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", model=" + model + ", year=" + year + ", mileage=" + mileage + "]";
	}

	public Bike(String bikeName, String model, int year, float mileage) {
		this.bikeName = bikeName;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
	}





	public static void main (String [] args) {
		 
	 
	
	   
	   List<Bike> bikeList = Arrays.asList(new Bike( "Hero","Passionpro",2007,62.0f),new Bike( "Bajaj","Pulsar",2010,40.1f),new Bike("yamaha","Rx100",2012,40.0f));
	   
	   for(int i = 0; i < bikeList.size();i++) {
		  
	 
	   System.out.println(bikeList.get(i).toString());
	  
	   
       
	 }
	 }
}