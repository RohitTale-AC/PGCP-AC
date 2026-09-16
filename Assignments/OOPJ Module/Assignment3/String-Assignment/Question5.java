
import secondJava.consoleInput;

public class Question5 {

	public static void main(String[] args) {

		// Java program to replace each substring of a given string that
		// matches the given regular expression with the given replacement.

		String str = "The quick brown fox jumps over the lazy dog.";

		System.out.println("Enter want to replace");
		String replace = consoleInput.getString();
		System.out.println("Enter what to replace");
		String replaced = consoleInput.getString();

		System.out.println("Original string: " + str);
		System.out.println("New string: " + str.replace(replace, replaced));

	}

}
