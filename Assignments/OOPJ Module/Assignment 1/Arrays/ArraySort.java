import secondJava.consoleInput;

public class ArraySort {

	public void sortArray() {
		System.out.println("Enter the size of the array : ");
		int size = consoleInput.getInt();

		int arr[] = new int[size];

		// Input of the array.
		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getInt();
		}

		System.out.println("Unsorted array is : ");
		// Before sorting the array.
		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(arr[iarr]);
		}

		// Sorting array.

		for (int isort = 0; isort < size; isort++) {
			for (int jsort = isort; jsort < size; jsort++) {
				if (arr[isort] > arr[jsort]) {
					int temp = arr[isort];
					arr[isort] = arr[jsort];
					arr[jsort] = temp;
				}
			}
		}

		System.out.println("Sorted array is : ");
		// After sorting the array.

		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(arr[iarr]);
		}
	}
}
