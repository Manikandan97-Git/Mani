package manikandan.java;

public class Taskoddandeven {
	public static void main (String [] args) {
		System.out.println("Even numbers are");
	  int [] numbers = {15,18,13,21,10,22,45,100,21,20,55};
	  for(int i = 0; i < numbers.length;i++) {
		  if(numbers[i]%2==0) {
			  System.out.println(numbers[i]);
		  }
		  }
	  
	  System.out.println("Odd numbers");
	  for (int i = 0; i < numbers.length;i++) {
		  if(numbers[i]%2!=0) {
			  System.out.println(numbers[i]);
		  }
	  }
	  
	  
	  
	  }
	

}
