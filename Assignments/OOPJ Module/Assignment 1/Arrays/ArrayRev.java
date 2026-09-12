import secondJava.consoleInput;

public class ArrayRev {
	public void revArray() {
		System.out.println("Enter the size of the array : ");
		int size = consoleInput.getInt();

		int arr[] = new int[size];

		// Input of the array.
		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getInt();
		}

		System.out.println("Array before reverse : ");
		// Before reverse the array.
		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(arr[iarr]);
		}

		System.out.println("Array after reverse : ");
		// After reverse the array.
		for (int iarr = size-1; iarr >= 0; iarr--) {
			System.out.println(arr[iarr]);
		}
	}
}
