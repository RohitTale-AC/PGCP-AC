import java.util.Scanner;

class Question15 {

	static void pattern() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				if (j < i) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}

	}

	public static void main(String args[]) {

		pattern();

	}
}
