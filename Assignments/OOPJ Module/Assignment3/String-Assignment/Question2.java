

public class Question2 {

	public static void main(String[] args) {
		
		// Two strings lexicographically

		String str1 = "This is Exercise 1 ";
		String str2 = "This is Exercise 2 ";

		System.out.println("String 1: This is Exercise 1");
		System.out.println("String 2: This is Exercise 2");

		if (str1.contentEquals(str2))
			System.out.println(str1 + "is same as" + str2);
		else
			System.out.println(str1 + " is less than " + str2);

	}

}
