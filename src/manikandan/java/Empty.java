package manikandan.java;
import java.util.*;

public class Empty{
	public static void main (String [] args) {
		
		
		ArrayList<ArrayList<String>> transport = new ArrayList();
		ArrayList<String>cars = new ArrayList();
		cars.add("Mustang");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Fiat");
		
		ArrayList<String>bikes = new ArrayList();
		bikes.add("Yamaha");
		bikes.add("Bajaj");
		bikes.add("Hero");
		
		ArrayList<String>buses = new ArrayList();
		buses.add("Volvo");
		buses.add("Mahindra");
		buses.add("Scania");
		
		transport.add(cars);
		transport.add(bikes);
		transport.add(buses);
		
		
		
		
		System.out.println(transport.get(2).get(0));
		
		
	}
}
