import secondJava.consoleInput;

public class Question1 {

	public static void main(String[] args) {
		// Character at the given index within the String.

		String str = "Java Exersices!";

		System.out.println("Original String = " + str);

		System.out.println("Enter the position : ");
		int position = consoleInput.getInt();

		for (int i = 1; i < str.length(); i++) {
			if (position == i) 
				System.out.println("The character at position " + i + " is " + str.charAt(i));
			
		}

	}

}
