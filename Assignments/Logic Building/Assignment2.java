public class Assignment2 {

	// Problem 4 Solution
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	String s;

	public static void main(String agrs[]) {

		// average obj = new average();

		// System.out.println(obj.a);
		// System.out.println(obj.b);
		// System.out.println(obj.c);
		// System.out.println(obj.d);
		// System.out.println(obj.e);
		// System.out.println(obj.f);
		// System.out.println(obj.g);
		// System.out.println(obj.h);

		// Problem 2 Solution

		// int year = 1900;

		// if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
		// System.out.println(year + " is a leap year.");
		// } else {
		// System.out.println(year + " is not a leap year.");
		// }

		// Problem 3 Solution

		// int num = 3;

		// switch (num) {
		// case 1:
		// System.out.println("The day is Monday.");
		// break;
		// case 2:
		// System.out.println("The day is Tuesday.");
		// break;
		// case 3:
		// System.out.println("The day is Wednesday.");
		// break;
		// case 4:
		// System.out.println("The day is Thursday.");
		// break;
		// case 5:
		// System.out.println("The day is Friday.");
		// break;
		// case 6:
		// System.out.println("The day is Monday.");
		// break;
		// case 7:
		// System.out.println("The day is Saturday.");
		// break;
		// case 8:
		// System.out.println("The day is Sunday.");
		// break;
		// default:
		// System.out.println("Invalid day Number");
		// }

		// Problem 1 Solution

		int math = 80;
		int science = 85;
		int history = 90;

		int average = (math + science + history) / 3;
		System.out.println(average);

		if (average >= 90) {
			System.out.println("Grade A");
		} else if (average >= 70 && average <= 89) {
			System.out.println("Grade B");
		} else if (average >= 50 && average <= 69) {
			System.out.println("Grade c");
		} else if (average >= 30 && average <= 49) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}

	}

}
