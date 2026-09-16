

public class Question4 {

	public static void main(String[] args) {
		// Java program to get the index of all the characters of the
		// alphabet.

		String str = "The quick brown fox jumps over the lazy dog.";

		str = str.toLowerCase();

		for (char ch = 'a'; ch <= 'j'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println(" ");

		for (char ch = 'a'; ch < 'j'; ch++) {
			System.out.print(str.indexOf(ch) + " ");
		}

		System.out.println(" ");

		for (char ch = 'k'; ch <= 't'; ch++) {
			System.out.print(ch + "  ");
		}

		System.out.println(" ");
		for (char ch = 'k'; ch <= 't'; ch++) {
			System.out.print(str.indexOf(ch) + " ");
		}

		System.out.println(" ");

		for (char ch = 'u'; ch <= 'z'; ch++) {
			System.out.print(ch + "  ");
		}

		System.out.println(" ");

		for (char ch = 'u'; ch <= 'z'; ch++) {
			System.out.print(str.indexOf(ch) + " ");
		}
	}

}
