import secondJava.consoleInput;

public class MinMaxArray {

	public void minMaxArr() {
		System.out.println("Enter the size of the array : ");
		int size = consoleInput.getInt();

		int arr[] = new int[size];

		// Input of the array.
		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getInt();
		}

		System.out.println("The entered array : ");
		// Before reverse the array.
		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(arr[iarr]);
		}

		int max = arr[0];
		int min = arr[0];

		for (int iarr = 0; iarr < size; iarr++) {
			if (max < arr[iarr]) {
				max = arr[iarr];
			} else if (min > arr[iarr]) {
				min = arr[iarr];
			}
		}

		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);

	}
}
