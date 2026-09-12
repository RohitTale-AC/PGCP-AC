import secondJava.consoleInput;

public class DupArray {

	
	public void dupValueArr() {

		System.out.println("Enter the size of array : ");
		int size = consoleInput.getInt();

		String arr[] = new String[size];

		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getString();
		}

		System.out.println("The main array is : ");
		for (int iarr = 0; iarr < size; iarr++) {
			System.out.println(arr[iarr]);
		}

		System.out.println("The duplicate values of the array : ");
		for (int iarr = 0; iarr < size; iarr++) {
			for (int jarr = iarr + 1; jarr < size; jarr++) {
				if (arr[iarr].equals(arr[jarr])) {
					System.out.println(arr[jarr]);
				}
			}

		}

	}
	
	
}
