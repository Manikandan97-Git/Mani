
public class Countline_string {

	public static void main(String[] args) {
		String str = "This is\na\nmulti-line\nstring";
	int numOfLines = 1; // Start with 1 since the string may not end with a newline
	for (int i = 0; i < str.length(); i++) {
	    if (str.charAt(i) == '\n') {
	        numOfLines++;
	    }
	}
	System.out.println("The number of lines in the string is: " + numOfLines);

		// TODO Auto-generated method stub

	}

}
