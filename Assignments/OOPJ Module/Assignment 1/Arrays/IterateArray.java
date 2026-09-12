import secondJava.consoleInput;

public class IterateArray {

	public void copyArray() {

		System.out.println("Enter the size of array : ");
		int size = consoleInput.getInt();

		int arr[] = new int[size];
		int copy[] = new int[arr.length];

		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getInt();
		}
		
		System.out.println("The main of the array : ");
		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(arr[iarr]);
		}

		for (int iarr = 0; iarr < size; iarr++) {
			copy[iarr] = arr[iarr];
		}

		System.out.println("The copy of the array : ");
		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(copy[iarr]);
		}

	}

}
