import secondJava.consoleInput;

public class DuplicateArray {

	public void duplicateArr() {

		System.out.println("Enter the size of array : ");
		int size = consoleInput.getInt();

		int arr[] = new int[size];

		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getInt();
		}

		System.out.println("The main of the array : ");
		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(arr[iarr]);
		}

		System.out.println("The duplicate integer values of the array : ");
		for (int iarr = 0; iarr < size; iarr++) {
			for (int jarr = iarr + 1; jarr < size; jarr++) {
				if (arr[iarr] == arr[jarr]) {
					System.out.println(arr[jarr]);
				}
			}

		}

	}

}
