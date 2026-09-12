import secondJava.consoleInput;

public class CommonElement {

	public void comElem() {

		System.out.println("Enter the size of array : ");
		int size = consoleInput.getInt();

		System.out.println("Enter the element of array : ");
		int arr1[] = new int[size];

		for (int iarr = 0; iarr < size; iarr++) {
			arr1[iarr] = consoleInput.getInt();
		}
		
		
		System.out.println("Enter the element of array : ");
		int arr2[] = new int[size];

		for (int iarr = 0; iarr < size; iarr++) {
			arr2[iarr] = consoleInput.getInt();
		}


		System.out.println("The duplicate element of the array : ");
		for (int iarr = 0; iarr < size; iarr++) {
			for (int jarr = iarr + 1; jarr < size; jarr++) {
				if (arr1[iarr] == arr2[jarr]) {
					System.out.println(jarr);
				}
			}

		}

	}

}
