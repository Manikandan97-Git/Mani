package manikandan.java;

public class Multiplemethod {
	
	static int myMethod(int x, int y) {
		return  x + y;
	}
	static float myMethod(float x, float y) {
		return x - y;
	}
    static double myMethod(double i, double j) {
    	return i * j;
    }
    static long myMethod(long a, long b) {
    	return a / b;
    }
    static void myMethod() {
    System.out.println("Hello world");
  }
       public static void main (String [] args) {
      int ans = myMethod(50, 60);
      float result = myMethod(10.5f, 5.5f);
      double answer = myMethod(5.0d, 2.0d);
      long key = myMethod(500L, 20L);
      System.out.println(ans);
      System.out.println(result);
      System.out.println(answer);
      System.out.println(key);
      myMethod();
      
       }
}  