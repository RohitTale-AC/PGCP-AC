import secondJava.consoleInput;

public class ArraySum {

	public void addArray(){
		
		System.out.println("Enter the size of the array : ");
		int size = consoleInput.getInt();

		int arr[] = new int[size];

		// Input of the array.
		for (int iarr = 0; iarr < size; iarr++) {
			arr[iarr] = consoleInput.getInt();
		}

		int sum=0;
		for (int iarr = 0; iarr < size; iarr++) {
			sum = sum + arr[iarr];
		}
		
		System.out.println("The sum of array is : "+ sum);
	
	}
	
	
}
