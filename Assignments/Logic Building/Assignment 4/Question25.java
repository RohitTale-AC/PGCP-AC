import java.util.*;

class Question25 {

	static void element(String str) {

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				sum++;
			}
		}
		System.out.println("The number of vowels in " + str + " is a " + sum);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sc.next();

		element(str);

	}
}